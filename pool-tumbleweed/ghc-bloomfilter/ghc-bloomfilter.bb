SUMMARY = "Pure and impure Bloom Filter implementations"
DESCRIPTION = "Pure and impure Bloom Filter implementations."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.2"

RPM_NAME = "ghc-bloomfilter-2.0.1.2-1.2.aarch64.rpm"
RPM_HASH = "0c9b555f96ca12141f057eb373149fc04b8b7b2982cb1cedbba82fb360705f3d7fd9825c498de7c32db9aa8a6a739c4c828e88e1174493f7db0f40d10a962216"

RPROVIDES:${PN} += "ghc-bloomfilter \
libHSbloomfilter-2.0.1.2-189xqL1vwBgClUIFXZGPWh-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
