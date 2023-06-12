SUMMARY = "VBI Decoding Library"
DESCRIPTION = "VBI stands for Vertical Blanking Interval, a gap between the image data \
transmitted in an analog video signal. This gap is used to transmit AM \
modulated data for various data services like Teletext and Closed \
Caption. \
 \
The zvbi library provides routines to read from raw VBI sampling \
devices, to demodulate raw to sliced VBI data, and to interpret the \
data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "libzvbi0-0.2.41-2.1.aarch64.rpm"
RPM_HASH = "612b033f90800e8d855992ae9e5781cc53dd289e10336d0f8154add1ba896bdb1ca067c9be15d0ffd191a9b93932aefcbe7117be103c99b6d0bf782afcc0f5e6"

RPROVIDES:${PN} += "libzvbi.so.0()(64bit) \
libzvbi0 \
libzvbi0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
