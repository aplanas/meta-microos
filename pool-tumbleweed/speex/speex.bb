SUMMARY = "An Open Source, Patent Free Speech Codec"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "speex-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "8662d45c8cdabcd78a9692d746312aafed10f76871642e011e7b3a55178cc075712c614e6d82c8568d037c754d44f9d1e98feee17c791efd69dccf2b3433aaa2"

RPROVIDES:${PN} += "speex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0 \
libspeex.so.1 \
libspeexdsp.so.1"

inherit rpm
