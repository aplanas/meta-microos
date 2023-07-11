SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python311-lxml-devel-4.9.2-7.3.aarch64.rpm"
RPM_HASH = "f262cad1b1f9e23d19ad3a009e40be9ec5afc1065fe1a23e97c73094750ec9606c8c728f7cc1970baf3cf7c8a948f1c9bcb01b044b80250c426ab36bc62af5b7"

RPROVIDES:${PN} += "python3-lxml-devel \
python311-lxml-devel"

RDEPENDS:${PN} += "python311-lxml"

inherit rpm
