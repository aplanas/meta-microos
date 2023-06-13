SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "libschroedinger-1_0-0-1.0.11-11.17.aarch64.rpm"
RPM_HASH = "f2e2989255681e686f652b636ef0f6f1fb9230d3dae3f90d32713e759bf9c3da53e0d5d20d63e26066a32d51f65476734aca1c23b8d1e921e0ac3e0ea02ede53"

RPROVIDES:${PN} += "libschroedinger-1.0.so.0()(64bit) \
libschroedinger-1_0-0 \
libschroedinger-1_0-0(aarch-64) \
schroedinger"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
liborc-0.4.so.0()(64bit)"

inherit rpm
