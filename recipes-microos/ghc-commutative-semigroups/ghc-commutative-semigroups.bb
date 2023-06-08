SUMMARY = "Commutative semigroups"
DESCRIPTION = "A commutative semigroup is a semigroup where the order of arguments to mappend \
does not matter."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-0.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "9b1abcd29db223c31e361bec2b0d109349a38783ef8c4fff417ec603ab60a8c81ec5f121396b1d3194aa4f258babbc152239d18b8886ebf8dba30933f5bda0a5"

RPROVIDES:${PN} += "ghc-commutative-semigroups ghc-commutative-semigroups(aarch-64) libHScommutative-semigroups-0.1.0.1-EHuCShtv7U46wPCL9foais-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
