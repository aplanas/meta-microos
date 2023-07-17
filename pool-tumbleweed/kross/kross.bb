SUMMARY = "Scripting bridge for programs"
DESCRIPTION = "Kross is a scripting bridge to embed scripting functionality \
into an application. It supports QtScript as a scripting interpreter backend."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kross-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3981a9640ffe7d748120a74fa24e07b1d8efa334686e923502cd116f7045ef6884046a455c69812f93472c6d81a02d1e2c62bb6da786af40e119de7394956511"

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
