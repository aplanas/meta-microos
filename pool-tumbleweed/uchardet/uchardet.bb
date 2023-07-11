SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "uchardet-0.0.8-1.4.aarch64.rpm"
RPM_HASH = "1e7cd214abaa355408d3f13649e63515d52ba149440866663579c7328d355284c094bb1140178a0e52719f8d53c725131dce2ae0cd1bb1b9e9ec4c7bedf2e6a2"

RPROVIDES:${PN} += "uchardet"

RDEPENDS:${PN} += "libc.so.6 \
libuchardet.so.0"

inherit rpm
