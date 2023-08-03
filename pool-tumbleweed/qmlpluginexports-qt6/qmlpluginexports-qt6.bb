SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt6-1.0-1.14.aarch64.rpm"
RPM_HASH = "02ababd9002afc5ba1deb282bd78c880f66e48374d2466d4391f9f593070fe97b2e1ecb426f2d37ee554f5a6521fb9fc42f3d545570636b4fc667e0546f09953"

RPROVIDES:${PN} += "qmlpluginexports-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
