SUMMARY = "Scripting bridge for programs"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kross-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7a2b167d503db97735b35b95479e7f7fd0c71c0e5dc22ba3aeda3ee9614b426bb3c65dd7efd173398b63a1fc20e39cd73d343dc4f44beeadc71e960cfe1f0f38"

RPROVIDES:${PN} += "kross \
libKF5KrossCore.so.5 \
libKF5KrossUi.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
