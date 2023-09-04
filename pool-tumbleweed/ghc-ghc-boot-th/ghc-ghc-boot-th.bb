SUMMARY = "Haskell ghc-boot-th library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-th-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "ec5baabcf0fad4791f67fd54e51f9a2ba2b522a0c7e1c8465750bffc5135998b938e0efaae06cbdf9dd4bd07c90dde0a1f11300a11a9b9963b81fa4cc3591400"

RPROVIDES:${PN} += "ghc-ghc-boot-th \
libHSghc-boot-th-9.4.6-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
