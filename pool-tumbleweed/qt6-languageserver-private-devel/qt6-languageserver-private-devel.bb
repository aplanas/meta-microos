SUMMARY = "Qt 6 LanguageServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 LanguageServer private library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-languageserver-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8bfde45e68a19ce6083ac3c604cc63b752579f3c8cda67620b94ae169f9c5146c2f518f54b4792c3b04527d216385d79ede0f9608063cade75c81f70155a1e1f"

RPROVIDES:${PN} += "cmake-Qt6LanguageServerPrivate \
qt6-languageserver-private-devel"

RDEPENDS:${PN} += "libQt6LanguageServer6 \
qt6-core-private-devel \
qt6-jsonrpc-private-devel"

inherit rpm
