SUMMARY = "YaST2 - AutoYaST Schema"
DESCRIPTION = "AutoYaST Syntax Schema"
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-schema-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "1e36bd0ff0d9fe72825c20c750a27611d3afb952c11c00348d85a422bc752df4e5154cb1a52ae983e17ffd0dcc48f362f7d692d8342d7beffae9255da4097d82"

RPROVIDES:${PN} += "yast2-schema \
yast2-schema(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
