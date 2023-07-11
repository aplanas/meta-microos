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

RPM_NAME = "python310-Brotli-1.0.9-2.3.aarch64.rpm"
RPM_HASH = "2bb4181f57ad98445830718a156d578c83d02ff399efe1fa359ee842d98034baf5789c5ea75882387dbee3169b846f4d836e8e28affad3739579628db5cf72da"

RPROVIDES:${PN} += "python3.10dist-brotli \
python310-Brotli \
python3dist-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
