SUMMARY = "Haskell ghc-boot-th library"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "5437576d1743730f7609e20edc53943a0e4eb4b115317039005d82b2103bb9ede7a6983eb0df9b692ae92bbc0f39b800a463ce931e65051760cb77ca743f957c"

RPROVIDES:${PN} += "ghc-ghc-boot-th \
ghc-ghc-boot-th(aarch-64) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
