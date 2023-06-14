SUMMARY = "Patent-free speech codec"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libspeexdsp1-1.2.1-2.1.aarch64.rpm"
RPM_HASH = "4b401bc721eddd24b7f1a1f10ad9313bd78e7c855f8877645e640d74995eb254be5e36fc4791afd8074c98aaf8078189868517adef479c4578ae8e1d781664d5"

RPROVIDES:${PN} += "libspeexdsp.so.1 \
libspeexdsp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
