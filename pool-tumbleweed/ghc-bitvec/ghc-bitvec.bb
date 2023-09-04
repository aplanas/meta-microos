SUMMARY = "Space-efficient bit vectors"
DESCRIPTION = "A newtype over 'Bool' with a better 'Vector' instance: 8x less memory, up to \
3500x faster. \
 \
The <https://hackage.haskell.org/package/vector vector> package represents \
unboxed arrays of 'Bool's spending 1 byte (8 bits) per boolean. This library \
provides a newtype wrapper 'Bit' and a custom instance of an unboxed 'Vector', \
which packs bits densely, achieving an __8x smaller memory footprint.__ The \
performance stays mostly the same; the most significant degradation happens for \
random writes (up to 10% slower). On the other hand, for certain bulk bit \
operations 'Vector' 'Bit' is up to 3500x faster than 'Vector' 'Bool'. \
 \
=== Thread safety \
 \
* 'Data.Bit' is faster, but writes and flips are not thread-safe. This is \
because naive updates are not atomic: they read the whole word from memory, \
then modify a bit, then write the whole word back. Concurrently modifying \
non-intersecting slices of the same underlying array may also lead to \
unexpected results, since they can share a word in memory. * \
'Data.Bit.ThreadSafe' is slower (usually 10-20%), but writes and flips are \
thread-safe. Additionally, concurrently modifying non-intersecting slices of \
the same underlying array works as expected. However, operations that affect \
multiple elements are not guaranteed to be atomic. \
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

PV = "1.1.5.0"

RPM_NAME = "ghc-bitvec-1.1.5.0-1.1.aarch64.rpm"
RPM_HASH = "682fe3e5b41e1b15e39bc30951693b81604895ee35c09ebfb4df71206d3d0cc167a366c77fa77bfe92be552ef30b0bd955c8ed8f14214f381efe25a17d7346ae"

RPROVIDES:${PN} += "ghc-bitvec \
libHSbitvec-1.1.5.0-4n2vDaVO5x4GAoTGOlyPxS-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
