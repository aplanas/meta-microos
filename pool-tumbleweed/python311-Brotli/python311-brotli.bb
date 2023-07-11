SUMMARY = "Python bindings for the Brotli compression library"
DESCRIPTION = "Brotli is a generic-purpose lossless compression algorithm that compresses data \
using a combination of a modern variant of the LZ77 algorithm, Huffman coding \
and 2nd order context modeling, with a compression ratio comparable to the best \
currently available general-purpose compression methods. It is similar in speed \
with deflate but offers more dense compression. \
 \
The specification of the Brotli Compressed Data Format is defined in RFC 7932."
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python311-Brotli-1.0.9-2.3.aarch64.rpm"
RPM_HASH = "9a7214eef1dbd89b98c128f38ac6e857059ad8e6b21a95cfd6e6c078ee7ef1ed30e97a0a5142235b435905569d631f819efade9522b5af3a4a2de519a0b0f1ef"

RPROVIDES:${PN} += "python3-Brotli \
python3.11dist-brotli \
python311-Brotli \
python3dist-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
