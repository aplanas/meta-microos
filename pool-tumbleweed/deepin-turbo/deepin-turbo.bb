SUMMARY = "A screenshot tool"
DESCRIPTION = "This is a default screenshot app for Linux Deepin."
LICENSE = "LGPL-2.1+"

PV = "0.0.5"

RPM_NAME = "deepin-turbo-0.0.5-2.9.aarch64.rpm"
RPM_HASH = "22a5d1a3098de8a5db6181839462306c05a972e74e3862c2e9a2058cbc9535c184a3a28f61def1c02e04fdedf2c17acddd405a0e6b5dbc761046384418dbdb52"

RPROVIDES:${PN} += "deepin-turbo"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdbus-1.so.3 \
libdeepin-turbo.so.0 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
