SUMMARY = "Commutative semigroups"
DESCRIPTION = "A commutative semigroup is a semigroup where the order of arguments to mappend \
does not matter."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-0.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "9b1abcd29db223c31e361bec2b0d109349a38783ef8c4fff417ec603ab60a8c81ec5f121396b1d3194aa4f258babbc152239d18b8886ebf8dba30933f5bda0a5"

RPROVIDES:${PN} += "ghc-commutative-semigroups \
libHScommutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
