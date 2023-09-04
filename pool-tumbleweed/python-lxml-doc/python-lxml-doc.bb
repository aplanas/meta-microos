SUMMARY = "Documentation for python-lxml, an XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains documentation for lxml (HTML and PDF)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python-lxml-doc-4.9.3-1.1.noarch.rpm"
RPM_HASH = "218f292a8a86e24f37924137e5f6782caa07c99c50314d4a89bf19780f6926ee1c42361339c45f33ab5bc418a64a47cf1ae89c6de1c8bda5d3d06f1b38adfd3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
