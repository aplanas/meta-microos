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

RPM_NAME = "ghc-blaze-builder-0.4.2.2-3.6.aarch64.rpm"
RPM_HASH = "e6817e97e423558c639ed74a4fece2f4b67f265bd875af4db0d08605771f567f7a50e0bc64de2ccd98efc4659eab6eb39e38e7dd9f90a3750c8b4231d68b53ec"

RPROVIDES:${PN} += "ghc-blaze-builder \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
