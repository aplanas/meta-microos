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

PV = "0.4.2.3"

RPM_NAME = "ghc-blaze-builder-0.4.2.3-1.1.aarch64.rpm"
RPM_HASH = "e35593a8eb9ec2a2a3fede798a00257b59ce46a3b9465dd8c72e285af7fed4b2cd7efa28021d8447435aa53e3fbc102fa2cd59fb27784cf52faf9e00c99a786d"

RPROVIDES:${PN} += "ghc-blaze-builder \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so"

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
