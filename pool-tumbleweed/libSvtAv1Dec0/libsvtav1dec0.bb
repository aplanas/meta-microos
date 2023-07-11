SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.6.0"

RPM_NAME = "libSvtAv1Dec0-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "8324ce85cfb1e41c2f704153986ca5c726b6c0bb799ec702ab676b2f85ee9dae7215c708c27dc2cfd0f2d9dae0698150899e171c23ab23b7e7453a9c107782a3"

RPROVIDES:${PN} += "libSvtAv1Dec.so.0 \
libSvtAv1Dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
