SUMMARY = "OpenBox window manager configuration tool"
DESCRIPTION = "Configuration tool for the OpenBox Window Manager. \
This tool is used by LXQt to configure OpenBox, since it is \
used as the default WindowManager in LXQt."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "obconf-qt-0.16.2-1.8.aarch64.rpm"
RPM_HASH = "1f5690bdd1e58814255a9ffc1adb08c8f127c5d17736f0976d0eed0b2103ac505e4f84d6b6c9226c6cef135106469612b2185aba5d2eeb853046a9492c5279a3"

RPROVIDES:${PN} += "obconf-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstdc++.so.6 \
libxml2.so.2 \
update-alternatives"

inherit rpm
