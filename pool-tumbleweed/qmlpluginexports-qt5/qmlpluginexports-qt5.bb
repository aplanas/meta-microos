SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt5-1.0-1.17.aarch64.rpm"
RPM_HASH = "59192b21b97b75eb8f3dc813573af8fe5b35db03affd009c20952e3abb9cabe61fa7af61e5e3206ee54da51ce180db9b2cc6955422409cc1291ac9af73a6911b"

RPROVIDES:${PN} += "qmlpluginexports-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
