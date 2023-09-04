SUMMARY = "Efficient buffered output"
DESCRIPTION = "This library allows to efficiently serialize Haskell values to lazy bytestrings \
with a large average chunk size. The large average chunk size allows to make \
good use of cache prefetching in later processing steps (e.g. \
compression) and reduces the system call overhead when writing the resulting \
lazy bytestring to a file or sending it over the network. \
 \
This library was inspired by the module Data.Binary.Builder provided by the \
binary package. It was originally developed with the specific needs of the \
blaze-html package in mind. Since then it has been restructured to serve as a \
drop-in replacement for Data.Binary.Builder, which it improves upon both in \
speed as well as expressivity."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.2"

RPM_NAME = "ghc-blaze-builder-0.4.2.2-3.8.aarch64.rpm"
RPM_HASH = "d9a91eee0deb11e43e3d1d2515383b0f48b786c8e7f514de4362b5e06af02cf61a7d7298b32d6d287e1760306ba96d3d46a1840d484f0cacad2afa85f3270df5"

RPROVIDES:${PN} += "ghc-blaze-builder \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
