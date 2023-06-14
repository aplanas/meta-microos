SUMMARY = "Selection of screensavers from xscreensaver"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
This packages contains additional graphics demos."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.06"

RPM_NAME = "xscreensaver-data-extra-6.06-4.3.aarch64.rpm"
RPM_HASH = "57e1aa8099cbcd3996e73c7301cc79cc20df5c78f81504090d2dcd4aae683f2ba31ccd1894e5b5a1edff4953bd3952bec9c48adb25cc24cb65294643b0dc8dac"

RPROVIDES:${PN} += "config-xscreensaver-data-extra \
xscreensaver-data-extra"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
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
libgle.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6"

inherit rpm
