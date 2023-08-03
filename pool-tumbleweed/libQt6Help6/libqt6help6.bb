SUMMARY = "Qt 6 Help library"
DESCRIPTION = "This package contains the Qt 6 Help library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "libQt6Help6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "4855ade314c36575b0c3905b0f38e694fc9b8c975645c94d83130c34afd37b4a582493382b6855f3e84509a9c3f9c3ce7d83161e01dddba9c2301d11c8b179c6"

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
