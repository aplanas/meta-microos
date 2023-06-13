SUMMARY = "Documentation for the Python acitoolkit library"
DESCRIPTION = "Documentation for python-acitoolkit."
LICENSE = "Apache-2.0"

PV = "0.4"

RPM_NAME = "python-acitoolkit-doc-0.4-5.5.noarch.rpm"
RPM_HASH = "fd09020e01d94fdb3654016a41a5c8bfe9d24d26fe7a1ba33e61ee6023f3ce44378c15b46e2e0c733cfdd59c7dcc5902f328c4bffd39b012a6ccc971eff2cefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-acitoolkit-doc"

RDEPENDS:${PN} += ""

inherit rpm
