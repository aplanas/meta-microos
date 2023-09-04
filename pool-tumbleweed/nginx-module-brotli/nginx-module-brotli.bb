SUMMARY = "NGINX module for Brotli compression"
DESCRIPTION = "ngx_brotli is a set of two nginx modules: \
 \
ngx_brotli filter module - used to compress responses on-the-fly, \
ngx_brotli static module - used to serve pre-compressed files. \
 \
Brotli is a generic-purpose lossless compression algorithm that \
compresses data using a combination of a modern variant of the LZ77 \
algorithm, Huffman coding and 2nd order context modeling, with a \
compression ratio comparable to the best currently available \
general-purpose compression methods. It is similar in speed with \
deflate but offers more dense compression."
LICENSE = "BSD-2-Clause"

PV = "1.0.0rc+g1"

RPM_NAME = "nginx-module-brotli-1.0.0rc+g1-1.9.aarch64.rpm"
RPM_HASH = "29ed5f0988b06b37d53d07db6d5a07ac3be7ca5d295b2ae3093830031c1467baa10c829cb2075f152d29f6b17a30a3c3cee6d7f683d8e722eb60459bf90351d4"

RPROVIDES:${PN} += "nginx-module-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
nginx"

inherit rpm
