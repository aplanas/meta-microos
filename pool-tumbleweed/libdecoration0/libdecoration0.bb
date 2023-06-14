SUMMARY = "Compiz window decoration library"
DESCRIPTION = "The window decoration library is responsible for drawing the \
window borders and title bar of windows managed by Compiz. It is \
used by window decorators like gtk-window-decorator."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "0.8.18"

RPM_NAME = "libdecoration0-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "25d488ce172cec65dff43de47d622997c3fcf5662b7b6aa5678205a43b3636b3e62701d795a1c04e9cea4ccfbd4dd501b2c3a6ba706c1ba9c4a6512a3d6d3448"

RPROVIDES:${PN} += "libdecoration.so.0 \
libdecoration0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
