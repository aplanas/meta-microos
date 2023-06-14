SUMMARY = "An AV1 decoder/encoder for video streams"
DESCRIPTION = "The Scalable Video Technology for AV1 (SVT-AV1 Encoder and Decoder) is an \
AV1-compliant encoder/decoder library core. The SVT-AV1 encoder development is \
a work-in-progress targeting performance levels applicable to both VOD and Live \
encoding / transcoding video applications. The SVT-AV1 decoder implementation \
is targeting future codec research activities."
LICENSE = "BSD-3-Clause-Clear"

PV = "1.4.1"

RPM_NAME = "libSvtAv1Dec0-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "d03381e8de258be8ec249a36708c01dfd6ca91c0ece2a6cc44cb2de873446b655fa328e82e4f3cf3de48f122a336d43a4f0c8d6f30ba6c5e10aff6035b2b66c1"

RPROVIDES:${PN} += "libSvtAv1Dec.so.0 \
libSvtAv1Dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
