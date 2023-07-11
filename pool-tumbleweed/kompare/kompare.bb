SUMMARY = "File Comparator"
DESCRIPTION = "Tool to visualize changes between two versions of a file."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kompare-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c8c1c0fa6da96b3c90b80479f5d653fee4e59d9cc5217dd3e55024ca0b4791525d913f571253055966d10121355e7f85412f924ca3426c3f1a37d57b47a257e9"

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
