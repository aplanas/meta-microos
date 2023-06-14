SUMMARY = "Selection of screensavers from xscreensaver"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
This packages contains a selection of graphics demos."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.06"

RPM_NAME = "xscreensaver-data-6.06-4.3.aarch64.rpm"
RPM_HASH = "1ba78034ee4b24b6c2e25c2e43716f8bf2a63bd7a73d270ca7b195eaa55ee0cc07d5664fd9a827d6fef71fc28e73ac0db361453d8c0322d134ef6eb2909488f8"

RPROVIDES:${PN} += "config-xscreensaver-data \
xscreensaver-data"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLU.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXt.so.6 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
