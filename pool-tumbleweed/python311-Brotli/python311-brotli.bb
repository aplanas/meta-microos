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

RPM_NAME = "python311-Brotli-1.0.9-2.1.aarch64.rpm"
RPM_HASH = "5f16d6d795b29ddb4d3d22b1f6839d094c3f3bc2e701d779f70262793928b7238c033488f5d5ad754d7befdce74f070e2a97e029e033d4a43909d5c4b813ef00"

RPROVIDES:${PN} += "python3.11dist-brotli \
python311-Brotli \
python3dist-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
