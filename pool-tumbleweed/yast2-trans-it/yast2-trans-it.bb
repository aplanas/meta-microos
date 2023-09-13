SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-it-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "0ac6a40d3af9bc47abc58512fa2ca779c00caddb9b1b15df73daffcaa696d929515a0f8ffd1fd9fda4ab5846eb04edff2f9650f125deeac49a23ee17c27d4dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
