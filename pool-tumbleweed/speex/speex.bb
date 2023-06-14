SUMMARY = "An Open Source, Patent Free Speech Codec"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "speex-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "3880a0880b4132221740038d695cc8a32c5496e953a523f45777c1604f32f48c9062348e22334720c272b75f322fd4783b1b172af1f7237fc2efbd09234dafd2"

RPROVIDES:${PN} += "speex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0 \
libspeex.so.1 \
libspeexdsp.so.1"

inherit rpm
