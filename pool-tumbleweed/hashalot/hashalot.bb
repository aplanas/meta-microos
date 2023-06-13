SUMMARY = "Read a passphrase and print a hash"
DESCRIPTION = "hashalot  is  a small tool that reads a passphrase from standard \
input, hashes it using the given hash type, and prints the result \
to standard output. Used by legacy encrypted volumes. \
 \
Supported hashes: \
* rmd160 \
* sha256 \
* sha384 \
* sha512"
LICENSE = "GPL-2.0-or-later"

PV = "0.3"

RPM_NAME = "hashalot-0.3-9.5.aarch64.rpm"
RPM_HASH = "1c040abb62f9db6e369ac422580c4f3b5fd057f98b5d3d2de8fa8d101f7d764d4304267673dc4e494f68c5526efc89983f9170d8a91c72fa4470cad18b569cb8"

RPROVIDES:${PN} += "cryptsetup:/sbin/hashalot \
hashalot \
hashalot(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit)"

inherit rpm
