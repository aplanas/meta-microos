SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python39-lxml-devel-4.9.3-1.1.aarch64.rpm"
RPM_HASH = "9b1f5cd49c5a046bdbae7fcafa493bcc12903e607699e0a0b30745ea720c37fe8eb80df221e3a3387b1f3d8290c465d950f82953fc0e56c1514db557b26fe985"

RPROVIDES:${PN} += "python39-lxml-devel"

RDEPENDS:${PN} += "python39-lxml"

inherit rpm
