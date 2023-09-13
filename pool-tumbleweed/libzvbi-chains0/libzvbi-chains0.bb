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

RPM_NAME = "libzvbi-chains0-0.2.42-1.1.aarch64.rpm"
RPM_HASH = "3ed35b7a8c2102ee9c81390a6313daa57e6a2da0b2e8ffb5c2b89466941f8a82ac7fd63d11d8c3d7c7302406c5b68419563148d5c6db88cd8304797fa361539b"

RPROVIDES:${PN} += "libzvbi-chains.so.0 \
libzvbi-chains0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
