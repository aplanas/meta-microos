SUMMARY = "A unit testing framework for Haskell"
DESCRIPTION = "HUnit is a unit testing framework for Haskell, inspired by the JUnit tool for \
Java, see: <http://www.junit.org>."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-1.6.2.0-2.8.aarch64.rpm"
RPM_HASH = "88b282bb2289c1b6e7eb7a6b7d6f2925032e12ce0da84434e0bab25d3f4801c7a931b8805e71769c40a4942bca0505d1d3f2692be213d2aca3ae7e17e1ca0689"

RPROVIDES:${PN} += "ghc-HUnit \
libHSHUnit-1.6.2.0-3fsauNNRJvI5u5lqiyApf4-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScall-stack-0.4.0-nQZfFxinEdIa1BWxMyadt-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
