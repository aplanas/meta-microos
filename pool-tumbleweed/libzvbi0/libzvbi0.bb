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

PV = "0.2.42"

RPM_NAME = "libzvbi0-0.2.42-1.1.aarch64.rpm"
RPM_HASH = "b3a08ec6e6839218adf2abeb9dfb23c04898e46cbadffff5462f35283af0b8254a15ebadeb8fe94f857dd8bbda05eddede184aaeade8e101f847d59bb2a4c5cb"

RPROVIDES:${PN} += "libzvbi.so.0 \
libzvbi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
