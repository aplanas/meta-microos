SUMMARY = "Paint Program"
DESCRIPTION = "Paint program by KDE"
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GFDL-1.2-or-later & GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kolourpaint-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e6635ff19ba5c9f9bf79c70355953c7e34567415ab37548f58be5aa4e336d1be888dc193e08650b28a9a25a0ce6dc5c91a86b7bb093e3f8dea71bde866ee28ba"

RPROVIDES:${PN} += "kolourpaint \
kolourpaint5 \
libkolourpaint-lgpl.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdelibs4support \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5Sane.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
