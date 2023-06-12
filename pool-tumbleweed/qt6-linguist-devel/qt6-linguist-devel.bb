SUMMARY = "Qt 6 linguist tools - Development files"
DESCRIPTION = "Development files for the Qt 6 linguist tools."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-linguist-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cc619ee44ade9291cf1c0a2735637356e3ef730375ec890b4d53f31fdfa0ee75a2e5ee439179134d97a008e2f03a49cc9dfac9c11564c317ef2b4a8cef6a59a6"

RPROVIDES:${PN} += "cmake(Qt6Linguist) \
cmake(Qt6LinguistTools) \
pkgconfig(Qt6Linguist) \
qt6-linguist-devel \
qt6-linguist-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
qt6-tools-linguist"

inherit rpm
