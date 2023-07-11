SUMMARY = "Pure and impure Bloom Filter implementations"
DESCRIPTION = "Pure and impure Bloom Filter implementations."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-2.0.1.0-6.6.aarch64.rpm"
RPM_HASH = "2bfd38cd2bf88cd51f233f0c8b5d5dba1b0b98372fefabe8157762e0e152c77a0945250d415de8352f70849a2187611303adc4c0e6e9867342858f67cbfcbadb"

RPROVIDES:${PN} += "ghc-bloomfilter \
libHSbloomfilter-2.0.1.0-3hF1ySDPbPQA7KQQeHgCqI-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
