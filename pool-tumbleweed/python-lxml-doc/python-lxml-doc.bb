SUMMARY = "Documentation for python-lxml, an XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains documentation for lxml (HTML and PDF)."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.3"

RPM_NAME = "python-lxml-doc-4.9.3-2.1.noarch.rpm"
RPM_HASH = "d266bc2d6835de468c78df40fc1c0ba2e0bb9670c301f25266c14b0af57f7bf9beda34868b7ffa02a4b286d9c246e3bdfdcf587bbad9ed632d637a29825b362f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-lxml-doc"

RDEPENDS:${PN} += ""

inherit rpm
