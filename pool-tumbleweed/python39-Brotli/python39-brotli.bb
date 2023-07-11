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

RPM_NAME = "python39-Brotli-1.0.9-2.3.aarch64.rpm"
RPM_HASH = "b3ec06525791629e065b9a14fb750b8845f6dc01c08847804a107f616ae7f8675d5678bafc5f8dbbed87ebf0fcd07b1f8b0ff9554daa393ab816b6de2cd8a3c5"

RPROVIDES:${PN} += "python3.9dist-brotli \
python39-Brotli \
python3dist-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
