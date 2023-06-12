SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python310-lxml-devel-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "61b7a033489dcb4cca7a705e70bdb5258eeef729bd15135f3a82cae71e9cf436b598de20dcc36ad6220dd510fc0a6c07cfc7db7bf952e69b46c7d8ee6329c2e3"

RPROVIDES:${PN} += "python3-lxml-devel \
python310-lxml-devel \
python310-lxml-devel(aarch-64)"
RDEPENDS:${PN} += "python310-lxml"

inherit rpm
