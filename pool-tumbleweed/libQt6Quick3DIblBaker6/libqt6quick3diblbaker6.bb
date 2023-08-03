SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Quick3DIblBaker6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "22e3f6c9618e4e851b6daeae9389ae4da8137d2abc7d71b1ac5da02c644335732090af94cd56bbb2c6f2d2b8709d76bb6072391a7af373333364e5cb527e00a7"

RPROVIDES:${PN} += "libQt6Quick3DIblBaker.so.6 \
libQt6Quick3DIblBaker6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
