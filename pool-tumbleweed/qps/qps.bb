SUMMARY = "Visual Process Manager"
DESCRIPTION = "Qps is a visual process manager, an X11 version of 'top' or 'ps' that \
displays processes in a window and lets you sort and manipulate them. It \
displays some general system information, and many details about current \
processes."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.7.0"

RPM_NAME = "qps-2.7.0-1.2.aarch64.rpm"
RPM_HASH = "1c3b2ed605390cd74acc29bcb92312104d64afa08d581cd43f34f9453c5be56af380848045e9baaf6d2803fd5162a05041e0ad16c240b070069193be8c82c509"

RPROVIDES:${PN} += "qps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
liblxqt.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
