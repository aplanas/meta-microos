SUMMARY = "Set- and Map-like types that remember the order elements were inserted"
DESCRIPTION = "Set- and Map-like types that remember the order elements were inserted."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-0.2.3-1.3.aarch64.rpm"
RPM_HASH = "47dfc792967f6e23fb822723e6bf4af19be60fda14a69d40b574cdfbce1afee100e8acb4b9422d06f086cfa85f76e969097b96429dbbb4d87eeca9fdd74216a5"

RPROVIDES:${PN} += "ghc-ordered-containers \
libHSordered-containers-0.2.3-2vvzHwtaKIjK7BBzxceSWT-ghc9.4.5.so"

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
