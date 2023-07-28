SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-kn-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "faf3d4f8e3fc6db4427b05cade2e55f89585b66e76aed2369474c40de332b3367cc9b66a7a88afb58e261385142fd88410c04f7dd63d29cf0601deed2cdf2d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
