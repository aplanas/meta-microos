SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python311-lxml-devel-4.9.2-8.1.aarch64.rpm"
RPM_HASH = "9179dbc8dfe3615fae46013083d7e92b9781c375e43f71f95c08551e1d57e95a41198e5cc9174bfe1d73122aa911bb149f3485c5d95f76bff09c4c8c086b00fb"

RPROVIDES:${PN} += "python3-lxml-devel \
python311-lxml-devel"

RDEPENDS:${PN} += "python311-lxml"

inherit rpm
