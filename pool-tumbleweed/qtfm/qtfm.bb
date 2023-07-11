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

RPM_NAME = "qtfm-6.2.1-2.4.aarch64.rpm"
RPM_HASH = "5da75927d262d9deef77c0fc1b5a6e11325fe4e13d4f24d8dff36212d3eacfbddede75c35563f18ee5ab3e588d6e75479dac19891cc6c1b59e595f19d4a6dcb7"

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
