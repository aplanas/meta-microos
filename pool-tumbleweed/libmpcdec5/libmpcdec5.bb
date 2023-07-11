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

RPM_NAME = "libmpcdec5-1.2.6-35.14.aarch64.rpm"
RPM_HASH = "903a2b0a7cd80b619d1d844d400786de3e585595a268c581effcd5704da7121171051dfac6ce8682ec41ef2d3026a30ea9723be77489a33b6a51ddd8ba030146"

RPROVIDES:${PN} += "libmpcdec \
libmpcdec.so.5 \
libmpcdec5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
