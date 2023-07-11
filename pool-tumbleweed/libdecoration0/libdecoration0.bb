SUMMARY = "Compiz window decoration library"
DESCRIPTION = "The window decoration library is responsible for drawing the \
window borders and title bar of windows managed by Compiz. It is \
used by window decorators like gtk-window-decorator."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "libdecoration0-0.8.18-2.9.aarch64.rpm"
RPM_HASH = "96731d0a27b7ae55eb2fd6730f92879d278e69c78f2effbef3ed1898a2550ee74a11f7e3c64f20fd43ecc7ceb15779719979e9919f93a01ecfa6ac37a8b79602"

RPROVIDES:${PN} += "libdecoration.so.0 \
libdecoration0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
