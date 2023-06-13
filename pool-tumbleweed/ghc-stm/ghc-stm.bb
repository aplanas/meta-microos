SUMMARY = "Haskell stm library"
DESCRIPTION = "This package provides the Haskell stm library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-2.5.1.0-3.1.aarch64.rpm"
RPM_HASH = "cde497e507ec06f1ac7f55ffa9916a492333d8b658c32ac8f7b33e79bcc640293ec882485cd717ea79a8bd0dbc08ea3b78fd5b63658f5e39c9b6b78f881f0fb9"

RPROVIDES:${PN} += "ghc-stm \
ghc-stm(aarch-64) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
