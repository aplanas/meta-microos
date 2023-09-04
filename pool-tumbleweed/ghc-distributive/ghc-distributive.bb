SUMMARY = "Distributive functors -- Dual to Traversable"
DESCRIPTION = "Distributive functors -- Dual to 'Traversable'."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-0.6.2.1-3.4.aarch64.rpm"
RPM_HASH = "0d77b2138b82e38e0275e027ea6508c8f3096518b00ebee79ae2f90fa929a6fdebca312e4adc91d829f21f572b854517433c06ba9fc38c5c1512869986e74b83"

RPROVIDES:${PN} += "ghc-distributive \
libHSdistributive-0.6.2.1-7gHlNDSCz3vFkde299iroS-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5-ghc9.4.6.so \
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
