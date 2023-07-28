SUMMARY = "Documentation for python-lxml, an XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains documentation for lxml (HTML and PDF)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python-lxml-doc-4.9.2-8.1.noarch.rpm"
RPM_HASH = "7d0871faf9305ab010d021ea0a29e61fa256596483c0b2192d337983f353a8facaa245721c611d3926cfca8091e1f8ec21b56520130cf73245002f8981744ccd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
