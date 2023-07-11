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

RPM_NAME = "nginx-module-brotli-1.0.0rc+g1-1.8.aarch64.rpm"
RPM_HASH = "dcec38d4bcb0a7338296a8a4ed832019c1c19d343ae3fe16f9a8caba0c3b6da14f40af76d59d607aeb117259bca64a75bc7fa3264efea9f635b90a0e2c4be3bd"

RPROVIDES:${PN} += "nginx-module-brotli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
nginx"

inherit rpm
