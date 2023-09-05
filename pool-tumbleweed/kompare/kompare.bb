SUMMARY = "File Comparator"
DESCRIPTION = "Tool to visualize changes between two versions of a file."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kompare-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "00ab3c1c6107eb90558016cdfe5cf6eb68f2c565550c641045baf82e4144427d6c9aecd68579c2ce403c38f8d7b4ce71d4301c5afeb03f59deacddd55a5aa862"

RPROVIDES:${PN} += "kompare \
kompare5 \
libkomparedialogpages.so.5 \
libkompareinterface.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5TextEditor.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkomparediff2.so.5 \
libstdc++.so.6"

inherit rpm
