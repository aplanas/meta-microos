SUMMARY = "wxWidgets interface description"
DESCRIPTION = "wxWidgets is a C++ library abstraction layer for a number of GUI \
backends. Applications can be created for different GUIs (GTK+, \
Motif, MS Windows, MacOS X, Windows CE, GPE) from the same source \
code. \
 \
This package contains the interface description in XML format, \
useful for generating bindings."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "wxWidgets-3_2-doc-xml-3.2.2.1-3.1.noarch.rpm"
RPM_HASH = "63d6869154cfcd5ea1258a947280d6f8acda1c59abd8492e258a2a978da99b02de7bd1ffb19f6c2ba197b9a8fed4f760ef6d21bcb2e1fb21e43c041dc77814d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxWidgets-3-2-doc-xml"

RDEPENDS:${PN} += ""

inherit rpm
