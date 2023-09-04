SUMMARY = "Haskell base library"
DESCRIPTION = "This package provides the Haskell base library."
LICENSE = "BSD-3-Clause"

PV = "4.17.2.0"

RPM_NAME = "ghc-base-4.17.2.0-1.1.aarch64.rpm"
RPM_HASH = "8ff96e8db3a7a457890ccaa0afdfd1febde40481acaec3683d555080169c899e7272e2cd4f0674a82ee97e79f4f0f1afecd494d22ff458f39e3b8286f7e44fed"

RPROVIDES:${PN} += "ghc-base \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSinteger-gmp-1.1-ghc9.4.6.so \
libHSrts-1.0.2-debug-ghc9.4.6.so \
libHSrts-1.0.2-ghc9.4.6.so \
libHSrts-1.0.2-thr-debug-ghc9.4.6.so \
libHSrts-1.0.2-thr-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
