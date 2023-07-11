SUMMARY = "A unit testing framework for Haskell"
DESCRIPTION = "HUnit is a unit testing framework for Haskell, inspired by the JUnit tool for \
Java, see: <http://www.junit.org>."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-1.6.2.0-2.6.aarch64.rpm"
RPM_HASH = "58f9a308fc516fbc786c2ea99d1799359bcb1e01057094c1c67325f973574f9e620555c506395e6d6e96e4bc294ce182d40aa3953021eff5e67208ef3aca87ee"

RPROVIDES:${PN} += "ghc-HUnit \
libHSHUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
