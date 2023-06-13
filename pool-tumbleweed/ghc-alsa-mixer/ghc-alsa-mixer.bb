SUMMARY = "Bindings to the ALSA simple mixer API"
DESCRIPTION = "This package provides bindings to the ALSA simple mixer API."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-0.3.0-4.2.aarch64.rpm"
RPM_HASH = "376be0c4f5c64260c7319bda3cb053b8952f7b8b9ce6be62f3730a7b64bbfa0bd939848ce9c99646a25ded36a4c66be87c46b3d71dc6732d5b4cb0938f2b1723"

RPROVIDES:${PN} += "ghc-alsa-mixer \
ghc-alsa-mixer(aarch-64) \
libHSalsa-mixer-0.3.0-Ff4FVP5Sg8l3sx20Z8BrVj-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSalsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSextensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
