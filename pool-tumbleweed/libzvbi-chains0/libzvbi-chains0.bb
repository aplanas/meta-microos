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

RPM_NAME = "libzvbi-chains0-0.2.41-2.2.aarch64.rpm"
RPM_HASH = "48c440ce5f415399b213d806c707b62e1afeba9de1c5bb74917e1870c0a48fb4080fb78654d291da754844f9477a7ad0fa9e90959b0a5788e74ab222596af952"

RPROVIDES:${PN} += "libzvbi-chains.so.0 \
libzvbi-chains0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
