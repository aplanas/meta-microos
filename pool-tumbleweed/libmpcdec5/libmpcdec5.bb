SUMMARY = "Musepack Audio Decoder"
DESCRIPTION = "Musepack is an audio compression format with a strong emphasis on high \
quality. It is not lossless, but it is designed for transparency, so \
that you cannot hear differences between the original WAV file and the \
much smaller MPC file. \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but since 1997 it \
has rapidly developed and vastly improved and is now at an advanced \
stage in which it contains heavily optimized and patentless code. \
 \
Musepack is not particularly optimized for low bit rates. The encoder \
was designed to be transparent at the --standard setting, thus little \
low bit rate tuning has gone into the codec, unlike that of AAC, \
Vorbis, WMA, and others that focus more on this region."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "libmpcdec5-1.2.6-35.13.aarch64.rpm"
RPM_HASH = "002d4f90aa8ccf0f497b312f7d3f777ef1cb5c3410ebaef1ff6e6b76d03e21c584cf3a1a4ff00ba13c4277ac57aa12c737a3de96977c6649c3f398ee086e67bc"

RPROVIDES:${PN} += "libmpcdec \
libmpcdec.so.5 \
libmpcdec5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
