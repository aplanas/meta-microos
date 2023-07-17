SUMMARY = "YaST2 - Thai Translations"
DESCRIPTION = "YaST2 - Thai translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-th-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "9446f41d9363954c488eeddfd65d3566de7aec6e31b53f92c397573ff38819a48f5b330fd52e3fb0973ffcd71f211f74598487852d8d30b49d34f8269e992245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-th \
yast2-trans-th"

RDEPENDS:${PN} += ""

inherit rpm
