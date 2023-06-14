SUMMARY = "File Comparator"
DESCRIPTION = "Tool to visualize changes between two versions of a file."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kompare-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5c2dea898bdbb935cd50febbc817ac80ac1c383a52d952fdc388fd5e0abc4c79a2b517271dec7dc56f8c1be95d4ad0c5ae7ecfa201f15bc00017bf03f7f0aff3"

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
