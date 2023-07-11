SUMMARY = "Haskell terminfo library"
DESCRIPTION = "This package provides the Haskell terminfo library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-0.4.1.5-3.2.aarch64.rpm"
RPM_HASH = "01e3f9ea13a5ef94d00d78d65f3516488eab3fd5f86955c7702ec044f2b5a4819042dc8bce74ce3b0e763757f9241ee692d2991e8bb754fda3a741708ef4d4fc"

RPROVIDES:${PN} += "ghc-terminfo \
libHSterminfo-0.4.1.5-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
