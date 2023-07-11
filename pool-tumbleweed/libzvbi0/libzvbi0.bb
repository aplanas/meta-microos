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

RPM_NAME = "libzvbi0-0.2.41-2.2.aarch64.rpm"
RPM_HASH = "cceea7561b58b339a44793cbd26e2d240423d6c761cfb3ea33e710a8fe5121c23eb0b811feebc2dfa419fe9f7e0931f30f116d43891cfcf3986bffd9793b5c5e"

RPROVIDES:${PN} += "libzvbi.so.0 \
libzvbi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
