SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-id-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "4d249070905cfc890d5facf2fe8ca827a55ab36d616b2a0240a34fff4c645c99e7970f9e5910cb39ff80c64e48339950e54ed823c62505a5734c11b5cd60015e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm
