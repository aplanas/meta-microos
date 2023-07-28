SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python39-lxml-devel-4.9.2-8.1.aarch64.rpm"
RPM_HASH = "d8821fe478ff5a264f41accd006b5c5c27bc157f8781cf91e0551b68eb40852b14363bfdae44dcd0c0bce6479d0d6507945b924bd0a5f61001e2488c1b0068b0"

RPROVIDES:${PN} += "python39-lxml-devel"

RDEPENDS:${PN} += "python39-lxml"

inherit rpm
