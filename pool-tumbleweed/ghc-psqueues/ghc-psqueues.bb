SUMMARY = "Pure priority search queues"
DESCRIPTION = "The psqueues package provides <http://en.wikipedia.org/wiki/Priority_queue \
Priority Search Queues> in three different flavors. \
 \
* 'OrdPSQ k p v', which uses the 'Ord k' instance to provide fast insertion, \
deletion and lookup. This implementation is based on Ralf Hinze's \
<http://citeseer.ist.psu.edu/hinze01simple.html A Simple Implementation \
Technique for Priority Search Queues>. Hence, it is similar to the \
<http://hackage.haskell.org/package/PSQueue PSQueue> library, although it is \
considerably faster and provides a slightly different API. \
 \
* 'IntPSQ p v' is a far more efficient implementation. It fixes the key type to \
'Int' and uses a <http://en.wikipedia.org/wiki/Radix_tree radix tree> (like \
'IntMap') with an additional min-heap property. \
 \
* 'HashPSQ k p v' is a fairly straightforward extension of 'IntPSQ': it simply \
uses the keys' hashes as indices in the 'IntPSQ'. If there are any hash \
collisions, it uses an 'OrdPSQ' to resolve those. The performance of this \
implementation is comparable to that of 'IntPSQ', but it is more widely \
applicable since the keys are not restricted to 'Int', but rather to any \
'Hashable' datatype. \
 \
Each of the three implementations provides the same API, so they can be used \
interchangeably. The benchmarks show how they perform relative to one another, \
and also compared to the other Priority Search Queue implementations on \
Hackage: <http://hackage.haskell.org/package/PSQueue PSQueue> and \
<http://hackage.haskell.org/package/fingertree-psqueue fingertree-psqueue>. \
 \
<<http://i.imgur.com/KmbDKR6.png>> \
 \
<<http://i.imgur.com/ClT181D.png>> \
 \
Typical applications of Priority Search Queues include: \
 \
* Caches, and more specifically LRU Caches; \
 \
* Schedulers; \
 \
* Pathfinding algorithms, such as Dijkstra's and A*."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-0.2.7.3-2.3.aarch64.rpm"
RPM_HASH = "752df6be6f2ac48502410cd3b893b239b7ed243841a69adc148c9c1b7ee488fde4eb7af5d94de033ec899a7f54a66f1d0824803f5d7bb9dd4b359aae0a2b35af"

RPROVIDES:${PN} += "ghc-psqueues \
libHSpsqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
