SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Translations for Esperanto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-eu-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "223486019240768cb5686ba3e46573d74858cff74674ce8fcbb697eb141a95097ee75f3f0ddfc41e2f6b8b81003edd4457aaf1d675fb692a83c78aaa81e16170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eu \
yast2-trans-eu"

RDEPENDS:${PN} += ""

inherit rpm
