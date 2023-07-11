SUMMARY = "An Open Source, Patent Free Speech Codec Library"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libspeex1-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "1c74d019e78faa85928990d6859ceebe50ec04bcc09e5175d4875dc9c03a0035ec5c52c3ac066b6b378694c2723ef5134d10b4673215b48e8b25f0bf3144f3f6"

RPROVIDES:${PN} += "libspeex \
libspeex.so.1 \
libspeex1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
