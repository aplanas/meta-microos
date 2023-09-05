SUMMARY = "Text autocorrection library"
DESCRIPTION = "This package provides the core KTextAddons library for text autocorrection."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextAutoCorrectionCore1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "cfc0d7b7cfa98817f6aad6ec862dd83102e4ab6f0ce325810e1c77424b11c4ff39cb696db3a977cb548f33eca2b1ebb911a8879660051df27a21c0a14314e833"

RPROVIDES:${PN} += "libKF5TextAutoCorrectionCore.so.1 \
libKF5TextAutoCorrectionCore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
