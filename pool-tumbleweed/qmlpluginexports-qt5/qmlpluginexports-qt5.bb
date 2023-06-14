SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt5-1.0-1.16.aarch64.rpm"
RPM_HASH = "f40b03221091b4586f17e729a7d312dfc13d23cbc53499d9d5703f563cb6ec643754e3801576afb60e0dc610f82eaaf08818a600fcbdfc309e9ac7005aecd408"

RPROVIDES:${PN} += "qmlpluginexports-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
