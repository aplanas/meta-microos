SUMMARY = "Decidable propositions"
DESCRIPTION = "This package provides a 'Dec' type. \
 \
' type Neg a = a -> Void \
 \
data Dec a = Yes a | No (Neg a) '."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-0.0.5-2.4.aarch64.rpm"
RPM_HASH = "42507d0013366144a8aaa5fce87681efc0590c88d3ebc38d54ac05f3132be392b50b182a283b4f6f35aeea4c97955e1947fda629f5d1b7519795735a80a0e5d0"

RPROVIDES:${PN} += "ghc-dec \
libHSdec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSboring-0.2.1-8UoR96J8uAp13B13xTdCnI-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
