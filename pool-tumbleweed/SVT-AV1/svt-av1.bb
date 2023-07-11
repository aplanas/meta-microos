SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.6.0"

RPM_NAME = "SVT-AV1-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "bdafb41fb1c574d2e53eb25acb7f6182a12f44aaee505040fd57ee72e53888048522d6eb4f8015c4d404755923bd3734f4cde531f3287a3389a92d8147bbc64f"

RPROVIDES:${PN} += "SVT-AV1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSvtAv1Dec.so.0 \
libSvtAv1Enc.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
