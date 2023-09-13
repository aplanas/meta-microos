SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python311-lxml-devel-4.9.3-2.1.aarch64.rpm"
RPM_HASH = "c307b661996c1cab413e255cd814418447dc9092e62d3c05c6fd33ccccaef1475dfb46844f330569775d9ab99b92dfeb29c4eacce7359ee2ae74088d2db21401"

RPROVIDES:${PN} += "python3-lxml-devel \
python311-lxml-devel"

RDEPENDS:${PN} += "python311-lxml"

inherit rpm
