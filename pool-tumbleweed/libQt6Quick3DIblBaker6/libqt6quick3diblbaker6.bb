SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DIblBaker6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4c859ab4cb8f8a9e5c27e3587b08b6a1bce60ba8764809c9f1facb8560a65fe6f6ce18dc23cbe6bc745911d03adc5451f7daf6c33a0422d51189fee9cd0bca9c"

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
