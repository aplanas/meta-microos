SUMMARY = "Haskell pretty library"
DESCRIPTION = "This package provides the Haskell pretty library."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-1.1.3.6-1.1.aarch64.rpm"
RPM_HASH = "997c90e0713d67d8a666cf118cbc0b8b80ea879eb39e1c75e21c7a738e0bd37d6aeab5c6c61c6e12839b158a76ead32453bec2999b6ed12647ccdd8fd426c3d0"

RPROVIDES:${PN} += "ghc-pretty ghc-pretty(aarch-64) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
