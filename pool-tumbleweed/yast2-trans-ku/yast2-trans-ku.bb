SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ku-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "be87c0efa22b3b0e4fe1c0c27842ead73db0b5b2f484d0d72365b27f85e409c9602f345ad37dc3f05d7ffc357a1a316f271caf310251606318a44e8eef603a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
