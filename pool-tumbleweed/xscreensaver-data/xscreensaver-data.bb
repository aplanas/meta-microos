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

RPM_NAME = "xscreensaver-data-6.06-4.4.aarch64.rpm"
RPM_HASH = "bff7f99a0962a446bfb9ad2ad7a46765cfda2134b303fa08f9202241a8849784a62b7a2c935ec693bd1f57f768fce094b19e6ed2388fe1ec106e48d501b60a4f"

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
