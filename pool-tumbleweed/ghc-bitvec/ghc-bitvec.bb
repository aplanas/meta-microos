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

RPM_NAME = "ghc-bitvec-1.1.4.0-1.3.aarch64.rpm"
RPM_HASH = "c90f80d00cf4cc47c61bb1f4e16246718f3d32b98d426df833c9f732e56edbd24a53fcd8af79472241ae2fbace461132756824dac1a32538ed43b98e9befe56a"

RPROVIDES:${PN} += "ghc-bitvec \
ghc-bitvec(aarch-64) \
libHSbitvec-1.1.4.0-FzBtDnbj1qCBVRHTrZUOXy-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
