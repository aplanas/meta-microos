SUMMARY = "Development files for libiec61883"
DESCRIPTION = "This library is an implementation of IEC 61883, part 1 (CIP, plug \
registers, and CMP), part 2 (DV-SD), part 4 (MPEG2-TS), and part 6 \
(AMDTP). Outside of IIDC, nearly all FireWire multimedia devices use \
IEC 61883 protocols. \
 \
The libiec61883 library provides a higher level API for streaming DV, \
MPEG-2 and audio over Linux IEEE 1394."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libiec61883-devel-1.2.0-8.27.aarch64.rpm"
RPM_HASH = "cfb914c274e781f6fda87e4346adbc044518f6d8eeb055dab93c742c00b2495b34dc2e6b39b09ada6bab951a2e9014ee23a018b2e70b01f7e0c58b0f629beab8"

RPROVIDES:${PN} += "libiec61883-devel \
pkgconfig-libiec61883"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiec61883-0 \
pkgconfig-libraw1394"

inherit rpm
