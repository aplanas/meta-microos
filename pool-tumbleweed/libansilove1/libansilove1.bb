SUMMARY = "Library for converting ANSI, ASCII, and other formats to PNG"
DESCRIPTION = "This library contains shared code regarding the conversion of ANSI and \
artscene related file formats into PNG images."
LICENSE = "BSD-2-Clause"

PV = "1.4.1"

RPM_NAME = "libansilove1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "c34ae771980140f57f2f23177ae281774b32fc75cf3611efaee66f6b6ef57ef7d69b29e832939cd0d9a0e6c268278ee9771f0ffd5119f78dac5cb65822fcd43d"

RPROVIDES:${PN} += "libansilove.so.1 \
libansilove1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
