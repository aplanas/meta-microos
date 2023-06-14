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

RPROVIDES:${PN} += "qtfm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libswscale.so.5.9"

inherit rpm
