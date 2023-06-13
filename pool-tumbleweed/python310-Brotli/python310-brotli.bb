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

RPM_NAME = "python310-Brotli-1.0.9-2.1.aarch64.rpm"
RPM_HASH = "3f18db0739bc20d48cee2a79af5c0afbe612b97ad59af9c157d7a79e9251322fe4a4f8ba88517f02958a7a140ca3dc58743a66e9d33d0fc0891b5b3678bdd030"

RPROVIDES:${PN} += "python3-Brotli \
python3.10dist(brotli) \
python310-Brotli \
python310-Brotli(aarch-64) \
python3dist(brotli)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
