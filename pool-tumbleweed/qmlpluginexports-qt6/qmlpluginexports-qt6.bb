SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt6-1.0-1.13.aarch64.rpm"
RPM_HASH = "139ed6263250f6ad3f3b6ec5247a8b26155682da5a8c03e941888387a12ed8a41c980ad68b5b65c8116437889c600daf143f281782066208c9fcdf1e0ce54c0a"

RPROVIDES:${PN} += "qmlpluginexports-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
