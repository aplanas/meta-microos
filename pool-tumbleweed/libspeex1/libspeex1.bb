SUMMARY = "An Open Source, Patent Free Speech Codec Library"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libspeex1-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "7543e892f331f241b4949142ffbb7e11e89592d128b0cfb24d1eff8f1d66c6a5d0635f97d7d7fc23904d7f95c35207b5a5e01658e9b00f7f9c4d0e82a25d3fb2"

RPROVIDES:${PN} += "libspeex \
libspeex.so.1 \
libspeex1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
