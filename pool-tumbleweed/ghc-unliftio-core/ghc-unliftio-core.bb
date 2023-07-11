SUMMARY = "The MonadUnliftIO typeclass for unlifting monads to IO"
DESCRIPTION = "Please see the documentation and README at \
<https://www.stackage.org/package/unliftio-core>."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-0.2.1.0-1.6.aarch64.rpm"
RPM_HASH = "5a02bac002cfaf346bb4bc3336f70915b79a937f18051f0f52f041cc4ad2f609bf2678582945f377004b1a591b224e050745bedfd2c9e07e4e120917de6c9519"

RPROVIDES:${PN} += "ghc-unliftio-core \
libHSunliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
