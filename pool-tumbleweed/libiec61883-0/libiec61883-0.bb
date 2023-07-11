SUMMARY = "Library implementing IEC 61883"
DESCRIPTION = "This library is an implementation of IEC 61883, part 1 (CIP, plug \
registers, and CMP), part 2 (DV-SD), part 4 (MPEG2-TS), and part 6 \
(AMDTP). Outside of IIDC, nearly all FireWire multimedia devices use \
IEC 61883 protocols. \
 \
The libiec61883 library provides a higher level API for streaming DV, \
MPEG-2 and audio over Linux IEEE 1394. This includes both reception and \
transmission. It uses the new 'rawiso' API of libraw1394, which \
transparently provides mmap-ed DMA for efficient data transfer. It also \
represents the third generation of I/O technology for Linux 1394 for \
these media types thereby removing the complexities of additional \
kernel modules, /dev nodes, and procfs. It also consolidates features \
for plug control registers and connection management that previously \
existed in experimental form in an unreleased version of libavc1394."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libiec61883-0-1.2.0-8.27.aarch64.rpm"
RPM_HASH = "24f5940ea0e00d3a989d6eeac048a238ffce3444d0b3761301108c97a3255528204635467dfe4f92ffa66c1da8cf4ccd6f2fb82ff421837eb01b1f5ef354576d"

RPROVIDES:${PN} += "libiec61883-0 \
libiec61883.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraw1394.so.11"

inherit rpm
