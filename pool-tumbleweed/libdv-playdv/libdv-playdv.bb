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

RPM_NAME = "libdv-playdv-1.0.0-179.5.aarch64.rpm"
RPM_HASH = "096f92745927bd6bb115de3f12e17982c6801afbcc90b76eee1872e6742b4efd5b21ebf814b8565b0d38e93c8893fd837154313da4405981c54de2ee171fb073"

RPROVIDES:${PN} += "libdv-playdv \
libdv-playdv(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXv.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdv.so.4()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
