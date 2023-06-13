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

PV = "0.4.0.1"

RPM_NAME = "ghc-strict-0.4.0.1-6.3.aarch64.rpm"
RPM_HASH = "b3bd559d80211b27143e42bc74da149ed934bd2a0f7cb6eb7e1ea7404a09ec0aabf2d8fe0d244ffcb7302df278a3508b42c45a784eb5b8567e72dbc5568f06ee"

RPROVIDES:${PN} += "ghc-strict \
ghc-strict(aarch-64) \
libHSstrict-0.4.0.1-74sO97OC4FSJXzLQO4CTJi-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSassoc-1.0.2-IAwklVGxRFw6xcadvaWWl7-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so()(64bit) \
libHSbifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScomonad-5.0.8-9UnH7KDg5138z3eBCPM7y4-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdistributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSindexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit) \
libHSthese-1.1.1.1-3POHYes25uBIW53bcrDd39-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
