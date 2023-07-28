SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ca-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "32e6245248a3797c8b50518034632547230707a53324b0ca8fb564f8c169e33dfc6603f7c97f272ac66cb86c22fa5b58781b94e3788c1b428343aed640c8cc70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
