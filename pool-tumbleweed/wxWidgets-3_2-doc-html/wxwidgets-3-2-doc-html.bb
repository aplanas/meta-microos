SUMMARY = "wxWidgets API documentation"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains the API documentation in HTML format."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-doc-html-3.2.2.1-3.1.noarch.rpm"
RPM_HASH = "20256b86244d58403e5dfe698ae5196a7831d3c8fbf85ec302b13b4678faa8c18cceb7ee552183734c95155a459faf59267d342f966741d39f06cb43974eb297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3-2-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
