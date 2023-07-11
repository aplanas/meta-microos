SUMMARY = "Strict data types and String IO"
DESCRIPTION = "This package provides strict versions of some standard Haskell data types \
(pairs, Maybe and Either). It also contains strict IO operations. \
 \
It is common knowledge that lazy datastructures can lead to space-leaks. \
This problem is particularly prominent, when using lazy datastructures to store \
the state of a long-running application in memory. One common solution to this \
problem is to use 'seq' and its variants in every piece of code that updates \
your state. However a much easier solution is to use fully strict types to \
store such state values. By 'fully strict types' we mean types for whose values \
it holds that, if they are in weak-head normal form, then they are also in \
normal form. Intuitively, this means that values of fully strict types cannot \
contain unevaluated thunks. \
 \
To define a fully strict datatype, one typically uses the following recipe. \
 \
1. Make all fields of every constructor strict; i.e., add a bang to all fields. \
 \
2. Use only strict types for the fields of the constructors. \
 \
The second requirement is problematic as it rules out the use of the standard \
Haskell 'Maybe', 'Either', and pair types. This library solves this problem by \
providing strict variants of these types and their corresponding standard \
support functions and type-class instances. \
 \
Note that this library does currently not provide fully strict lists. \
They can be added if they are really required. However, in many cases one \
probably wants to use unboxed or strict boxed vectors from the 'vector' library \
(<http://hackage.haskell.org/package/vector>) instead of strict lists. \
Moreover, instead of 'String's one probably wants to use strict 'Text' values \
from the 'text' library (<http://hackage.haskell.org/package/text>). \
 \
This library comes with batteries included; i.e., mirror functions and \
instances of the lazy versions in 'base'. It also includes instances for \
type-classes from the 'deepseq', 'binary', and 'hashable' packages."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-0.5-1.3.aarch64.rpm"
RPM_HASH = "697137b04b21c6283e79b3d7c679be340acdbf7590bd6f68744be6f5072f1eab25ae76854e1c91f54cc0c7c62b28ffd0453e214f296f3cb1c668708b9d83e4cd"

RPROVIDES:${PN} += "ghc-strict \
libHSstrict-0.5-BMGWBclA5sg312fCUlbuTw-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSassoc-1.1-H3gdf0Ue1d5sn9822dJ4G-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSfoldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSthese-1.2-3gvRWs9hjHpLbWG1JfTveA-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
