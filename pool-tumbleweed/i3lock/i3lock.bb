SUMMARY = "Screen Locker for the i3 Window Manager"
DESCRIPTION = "i3lock is a simple screen locker like slock. After starting it, you will see a \
white screen (you can configure the color/an image). You can return to your \
screen by entering your password."
LICENSE = "BSD-3-Clause"

PV = "2.14.1"

RPM_NAME = "i3lock-2.14.1-1.1.aarch64.rpm"
RPM_HASH = "e0f75a0626dabc08129397d1407ee257448f6494fe4e5376e7046c842761813672276a532dcb54e36874cdbb4b9b029e6d867491cfaa21ccd620c32bbf3896c9"

RPROVIDES:${PN} += "i3lock"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libev.so.4 \
libpam.so.0 \
libxcb-image.so.0 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
