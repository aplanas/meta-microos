SUMMARY = "A unit testing framework for Haskell"
DESCRIPTION = "HUnit is a unit testing framework for Haskell, inspired by the JUnit tool for \
Java, see: <http://www.junit.org>."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-1.6.2.0-2.3.aarch64.rpm"
RPM_HASH = "c818edd247835c02cc944dd36d5ad47162c2785aa06e70f05a2fabe835b756803fc0cd5b6062115055f87b97adc9f562fc109bfbb1e7886af86a730a017cb8ea"

RPROVIDES:${PN} += "ghc-HUnit \
ghc-HUnit(aarch-64) \
libHSHUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
