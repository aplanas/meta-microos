SUMMARY = "OpenBox window manager configuration tool"
DESCRIPTION = "Configuration tool for the OpenBox Window Manager. \
This tool is used by LXQt to configure OpenBox, since it is \
used as the default WindowManager in LXQt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "obconf-qt-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "da6eb79cc61ea84f1f1547177032009b5a0978359f515af64496e1f20f3038947a05f70e98c9f44f1fcca2339faf75d01afe51ba5e2afabe78ecae5f8ec8df81"

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
