SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "libschroedinger-1_0-0-1.0.11-11.18.aarch64.rpm"
RPM_HASH = "eb05003c28c8dbd742c5c6dc28c6d05de1ee62a3aa412866dad5e5bdecfb1e57bc8712c1591d06e3385295ebf78ab85e1b87159f9403019ae35b386a14f31e6a"

RPROVIDES:${PN} += "libschroedinger-1-0-0 \
libschroedinger-1.0.so.0 \
schroedinger"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm
