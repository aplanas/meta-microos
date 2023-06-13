SUMMARY = "Documentaqtion for libtinyxml"
DESCRIPTION = "This packages contains the HTML documentation and a tutorial for \
libtinyxml"
LICENSE = "GPL-2.0-or-later"

PV = "2.6.2"

RPM_NAME = "tinyxml-docs-2.6.2-10.8.aarch64.rpm"
RPM_HASH = "3e55d8e14e9b9cabb535d66f8c9a88b1b2b1f6d0cb38790931afff9b126ff300576deed2b2690860ded2cc65149ff8e307419955b2f88fde93ac5f5387ab075a"

RPROVIDES:${PN} += "tinyxml-docs \
tinyxml-docs(aarch-64)"

RDEPENDS:${PN} += "libtinyxml0"

inherit rpm
