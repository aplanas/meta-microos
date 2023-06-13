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

RPM_NAME = "ghc-blaze-builder-0.4.2.2-3.3.aarch64.rpm"
RPM_HASH = "f4f2e08e5c6d79a3c86933c0953c49f316a803e129bd3417170c62348e3f33e7d664ea85b98fb5603f94da192a873c1203f68cd64ee90b5f0608db93501f31dc"

RPROVIDES:${PN} += "ghc-blaze-builder \
ghc-blaze-builder(aarch-64) \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
