SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python310-lxml-devel-4.9.2-8.1.aarch64.rpm"
RPM_HASH = "6cefef6b25be1cdf54181f29aed3ec22ad24b233f5c2262f3f303e8e903011f67348cf53c4656f3168db84555a98c92516b1993587fa8d266ff7ac92f4aac2f9"

RPROVIDES:${PN} += "python310-lxml-devel"

RDEPENDS:${PN} += "python310-lxml"

inherit rpm
