SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.4.1"

RPM_NAME = "SVT-AV1-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "e8984cd140a31949c76a4de7d2f9f9a7c05fa17b3ab3bec9421bb83f3213df54fd5dfa57027bcb2fa2601c2589d2751107ad95120c6c7ab7c3bab23439dadeaa"

RPROVIDES:${PN} += "SVT-AV1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSvtAv1Dec.so.0 \
libSvtAv1Enc.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
