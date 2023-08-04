SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "libkdecorations2-5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "ad70503258159cbf118b116f48f341b634ea7280701444c458f22114c15355310b3c602869e7da1e59777f97b2191773dfbbed8054ec00d4ecf34d6033b07066"

RPROVIDES:${PN} += "libkdecorations2-5 \
libkdecorations2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libkdecorations2private.so.10 \
libstdc++.so.6"

inherit rpm
