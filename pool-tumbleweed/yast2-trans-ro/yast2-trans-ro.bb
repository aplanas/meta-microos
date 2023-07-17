SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ro-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "640c260934585d8be68b8a1480c04e6e0da3de7e9ed926c2b7dc0baf85bc7865569c77e50f2fb0550b20c341b4df5b685a69f4279f317a6ca6598ea8d3ac0daa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
