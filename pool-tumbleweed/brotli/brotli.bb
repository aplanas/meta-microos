SUMMARY = "Lossless Compression Algorithm"
DESCRIPTION = "This package contains the brotli command line utility to compress and \
decompress data with the brotli compression algorithm. \
 \
Brotli is a generic-purpose lossless compression algorithm that \
compresses data using a combination of a modern variant of the LZ77 \
algorithm, Huffman coding and 2nd order context modeling, with a \
compression ratio comparable to the best currently available \
general-purpose compression methods. It is similar in speed with \
deflate but offers more dense compression. \
 \
The specification of the Brotli Compressed Data Format is defined in \
RFC 7932."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "brotli-1.0.9-3.4.aarch64.rpm"
RPM_HASH = "0db214b852c4bc498674d4fa440e12bd78d00d428272f364cdea4a5eb939907c0b90ab43e653582d52964ef244097732715f1ca993713e5e497781fbbce14438"

RPROVIDES:${PN} += "brotli"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
