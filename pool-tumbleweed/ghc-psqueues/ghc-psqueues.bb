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

RPM_NAME = "ghc-psqueues-0.2.7.3-2.9.aarch64.rpm"
RPM_HASH = "e5d63e87019082eee3f6f03b88b6015854afc9d48dbc127e9bb26738344e8b8846cc199f40152ab7b9e9fa66bb04fb666b3c4cff3ead3bfd5d86128e595001fc"

RPROVIDES:${PN} += "ghc-psqueues \
libHSpsqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
