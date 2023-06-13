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

RPM_NAME = "brotli-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "1d10e7e95c2108a9e9d4ee06f0b7b5d81016ec31a501bf6cc11c9877f579b1d548b5d990721f241f063133fbd2486da7e563b2d8ae4d0b4b5f80a27a5dcaf6ca"

RPROVIDES:${PN} += "brotli \
brotli(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
