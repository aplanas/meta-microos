SUMMARY = "Qt 6 Help library"
DESCRIPTION = "This package contains the Qt 6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Help6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "1cba7fc28e13426c3b69ff91060f096ff6e4eecebcdee069271777a32448200c28124611e90d3441b4ca785bc17a98684c20cd9551be457fefb3525d3cb3594f"

RPROVIDES:${PN} += "libQt6Help.so.6 \
libQt6Help6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
