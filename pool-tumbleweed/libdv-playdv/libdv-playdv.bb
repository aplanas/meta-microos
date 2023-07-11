SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M. \
 \
This package contains the playdv sample application."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-playdv-1.0.0-179.6.aarch64.rpm"
RPM_HASH = "6f8391e87166c9b680491d21989055bc767d43d84043c5a3d6c170f8f4b70959c7be25a4db04577f8d25c8156fa19c2d2a0669e9ccf946389b2c307d280aa2fa"

RPROVIDES:${PN} += "libdv-playdv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libc.so.6 \
libdv.so.4 \
libgdk-x11-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpopt.so.0"

inherit rpm
