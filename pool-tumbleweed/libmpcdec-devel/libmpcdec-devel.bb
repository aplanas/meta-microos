SUMMARY = "Musepack Audio Decoder"
DESCRIPTION = "Musepack is an audio compression format with a strong emphasis on high \
quality. It's not lossless, but it is designed for transparency, so \
that you won't be able to hear differences between the original wave \
file and the much smaller MPC file. \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but since 1997 it \
has rapidly developed and vastly improved and is now at an advanced \
stage in which it contains heavily optimized and patentless code. \
 \
Musepack is not particularly optimized for low bitrates. The encoder \
was designed to be transparent at the --standard setting, thus little \
low bitrate tuning has gone into the codec, opposite to that of AAC, \
Vorbis, WMA and others which focus more on this region."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "libmpcdec-devel-1.2.6-35.14.aarch64.rpm"
RPM_HASH = "a5f24a4036798b85f6827b97f73ab4a020e81c70939bf640b342d87f831434f231505a4c3d164ae9d34b096c0f0f88fb2e9a6658dcfbd811ede2d68c7f2343be"

RPROVIDES:${PN} += "libmpcdec-devel"

RDEPENDS:${PN} += "glibc-devel \
libmpcdec5"

inherit rpm
