SUMMARY = "Haskell filepath library"
DESCRIPTION = "This package provides the Haskell filepath library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-1.4.2.2-3.1.aarch64.rpm"
RPM_HASH = "df1a862fe2f8578283de08d2add85103469c9b4aa902cbb4184d47d665969fee21cef37370767562044d54c9abbbc848e4ca30b08ac7e617afc62c1a745f72f6"

RPROVIDES:${PN} += "ghc-filepath \
ghc-filepath(aarch-64) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
