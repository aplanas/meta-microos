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

RPM_NAME = "nginx-module-brotli-1.0.0rc+g1-1.7.aarch64.rpm"
RPM_HASH = "221fdfb6964f9557665b0989c77bc22238a50e248dd49fb6f0b5dea78f9167b524361c9aa4374af5eacad4a821f3c76eadefcc0a95c6cd9a5ad7ff79a3e9a024"

RPROVIDES:${PN} += "nginx-module-brotli \
nginx-module-brotli(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6()(64bit) \
nginx"

inherit rpm
