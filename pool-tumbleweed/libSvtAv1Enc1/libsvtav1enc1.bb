SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.6.0"

RPM_NAME = "libSvtAv1Enc1-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "50e6933f34ba23a364f2c05f42374fc07227a15aff5b91768df410f4a5d5752db7e0fb2b918318ff072617f6dac59ff2604f6fb53c9ff273c2778af2846b2a05"

RPROVIDES:${PN} += "libSvtAv1Enc.so.1 \
libSvtAv1Enc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
