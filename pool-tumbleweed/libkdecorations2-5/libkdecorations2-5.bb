SUMMARY = "KDE's window decorations library"
DESCRIPTION = "Plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "libkdecorations2-5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "7db10cd0a711758f65a55aceb814a466c3d003831c411295416d4fc05306608d888e37a01a24064d2e3849c19cb8926bb9ad003a592fab6b5f82197c9fe3643a"

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
