SUMMARY = "Qt-based GUI for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
PulseView is a Qt-based GUI for sigrok."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "pulseview-0.4.2-3.16.aarch64.rpm"
RPM_HASH = "e8a1618f5fe0c810b382832e376117d57f0002810b1848bbc217dd9288c9329cbe6c5c003e4ade284108a07642f25cb9e45bdebc79f9226cb636872b0dfd6545"

RPROVIDES:${PN} += "application() \
application(org.sigrok.PulseView.desktop) \
metainfo() \
metainfo(org.sigrok.PulseView.appdata.xml) \
mimehandler(application/vnd.sigrok.session) \
pulseview \
pulseview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libm.so.6()(64bit) \
libsigrok.so.4()(64bit) \
libsigrokcxx.so.4()(64bit) \
libsigrokdecode.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
