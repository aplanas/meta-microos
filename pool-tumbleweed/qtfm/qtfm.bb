SUMMARY = "Qt File Manager"
DESCRIPTION = "Lightweight file manager using Qt. \
 \
Features: \
 * Desktop (theme/applications/mime) integration \
 * Customizable interface \
 * Powerful custom command system \
 * Customizable key bindings \
 * Drag & drop functionality \
 * Tabs \
 * Udisks support \
 * System tray daemon"
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "6.2.1"

RPM_NAME = "qtfm-6.2.1-2.3.aarch64.rpm"
RPM_HASH = "d7a2dbf1af0d9d5edbeb6cee9b33e88f42f6f3c5925d26a8a5879cdf8d9b8d496f7cd6f07d383be86762f96fde98e6362e048ff918b85c3a4e45a1fde5842c78"

RPROVIDES:${PN} += "application() \
application(qtfm.desktop) \
mimehandler(application/x-directory) \
mimehandler(inode/directory) \
qtfm \
qtfm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit)"

inherit rpm
