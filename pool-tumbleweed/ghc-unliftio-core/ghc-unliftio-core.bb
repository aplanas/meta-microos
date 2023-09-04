SUMMARY = "The MonadUnliftIO typeclass for unlifting monads to IO"
DESCRIPTION = "Please see the documentation and README at \
<https://www.stackage.org/package/unliftio-core>."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-0.2.1.0-1.8.aarch64.rpm"
RPM_HASH = "7e68e51babdabad97adaf599b5af9371dc7effad17125028770beb883432abb2ff07a2c69f3c5bca3f54b644e934068810d89a6c031cc588b9bb0fed380e65cd"

RPROVIDES:${PN} += "ghc-unliftio-core \
libHSunliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
