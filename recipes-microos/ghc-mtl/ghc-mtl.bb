SUMMARY = "Haskell mtl library"
DESCRIPTION = "This package provides the Haskell mtl library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "e698d85f7a49e10c8c86e3c5ae2f481e15083a516c2fc534684ff3e7cf4c4dfea0ff7a8b085ff7b1ce75faf79434468d9c6666a9aa8777906a533e31aad5fb53"

RPROVIDES:${PN} += "ghc-mtl ghc-mtl(aarch-64) libHSmtl-2.2.2-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
