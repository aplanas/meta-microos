SUMMARY = "Space-efficient bit vectors"
DESCRIPTION = "A newtype over 'Bool' with a better 'Vector' instance: 8x less memory, up to \
1000x faster. \
 \
The <https://hackage.haskell.org/package/vector vector> package represents \
unboxed arrays of 'Bool's spending 1 byte (8 bits) per boolean. This library \
provides a newtype wrapper 'Bit' and a custom instance of an unboxed 'Vector', \
which packs bits densely, achieving an __8x smaller memory footprint.__ The \
performance stays mostly the same; the most significant degradation happens for \
random writes (up to 10% slower). On the other hand, for certain bulk bit \
operations 'Vector' 'Bit' is up to 1000x faster than 'Vector' 'Bool'. \
 \
=== Thread safety \
 \
* 'Data.Bit' is faster, but writes and flips are thread-unsafe. This is because \
naive updates are not atomic: they read the whole word from memory, then modify \
a bit, then write the whole word back. * 'Data.Bit.ThreadSafe' is slower \
(usually 10-20%), but writes and flips are thread-safe. \
 \
=== Similar packages \
 \
* <https://hackage.haskell.org/package/bv bv> and \
<https://hackage.haskell.org/package/bv-little bv-little> do not offer mutable \
vectors. \
 \
* <https://hackage.haskell.org/package/array array> is memory-efficient for \
'Bool', but lacks a handy 'Vector' interface and is not thread-safe."
LICENSE = "BSD-3-Clause"

PV = "1.1.4.0"

RPM_NAME = "ghc-bitvec-1.1.4.0-1.6.aarch64.rpm"
RPM_HASH = "401e4f0ab47fe7934fe5182705f4f6b4d942184be8e50c657e85af1a227cbb8e175bfaec944d3d19871b2a4addf7e3d4dc174ce09a4c19477a1392465c7173ec"

RPROVIDES:${PN} += "ghc-bitvec \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
