SUMMARY = "Directed acyclic graphs"
DESCRIPTION = "Directed acyclic graphs can be sorted topographically. Existence of topographic \
ordering allows writing many graph algorithms efficiently. And many graphs, \
e.g. most dependency graphs are acyclic! \
 \
There are some algorithms built-in: dfs, transpose, transitive closure, \
transitive reduction... Some algorithms even become not-so-hard to implement, \
like a longest path!."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-1.0.0.2-2.4.aarch64.rpm"
RPM_HASH = "5ebe1e942703ead4b2e78606b856b78a783c7bd971f692fc7e32b6fb301e4252821427c836088dd18b592fee9fcc8d8d99d2e0227c7859f3831c267bb3997cef"

RPROVIDES:${PN} += "ghc-topograph \
libHStopograph-1.0.0.2-5YRiUwFEAtYF8P5cpJe97E-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
