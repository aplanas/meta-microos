SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt6-1.0-1.12.aarch64.rpm"
RPM_HASH = "4844274e87ed01ab548367a3e7709327c200bc16f5d81161833086379acde16c43e1ab5520a80ab9e0c18284f7308836240d8055284200a1af89ab70cdb1514e"

RPROVIDES:${PN} += "qmlpluginexports-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
