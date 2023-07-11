SUMMARY = "Documentation for python-lxml, an XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains documentation for lxml (HTML and PDF)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python-lxml-doc-4.9.2-7.3.noarch.rpm"
RPM_HASH = "a48a5c7fc6f264294714f3ab29c7eb693d1c0f7f2b7d2e43d2f5376d77a7d715686476dfcdc49befc5ad4fa1f2663149a8e71caae28746f5fead3e18ef57943f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
