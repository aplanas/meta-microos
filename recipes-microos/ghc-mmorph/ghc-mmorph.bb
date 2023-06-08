SUMMARY = "Monad morphisms"
DESCRIPTION = "This library provides monad morphism utilities, most commonly used for \
manipulating monad transformer stacks."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-1.2.0-4.2.aarch64.rpm"
RPM_HASH = "9ad59fadc6abaa66e7021b2fa7064d42565c519817f71d44f376fdb5784f80586d4724ea63161534faaef45bf2fe2167c1f9154c9068dca4b0039d02d730dd89"

RPROVIDES:${PN} += "ghc-mmorph ghc-mmorph(aarch-64) libHSmmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
