SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python310-lxml-devel-4.9.3-2.1.aarch64.rpm"
RPM_HASH = "bf8f7e2770670f55194cdfdb9b754658e05126b71481f680ef0e4f48aecf171f190b0337ccd3d8b8b654e39fed71c71f5eaa0eeb2c404e2aa2cb3931341b147d"

RPROVIDES:${PN} += "python310-lxml-devel"

RDEPENDS:${PN} += "python310-lxml"

inherit rpm
