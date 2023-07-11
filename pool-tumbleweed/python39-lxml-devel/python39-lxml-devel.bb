SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python39-lxml-devel-4.9.2-7.3.aarch64.rpm"
RPM_HASH = "22424a6a3c4b11f1b4adafaaad4377a09d97d53c851bcdd34e5e3bbb39cb8aad3655c44a1365672ae0ccb501a5528be13e81a0de29e1d17539a4b42697dfa850"

RPROVIDES:${PN} += "python39-lxml-devel"

RDEPENDS:${PN} += "python39-lxml"

inherit rpm
