SUMMARY = "Picture loading/serialization (in png, jpeg, bitmap, gif, tga, tiff and radiance)"
DESCRIPTION = "This library can load and store images in PNG,Bitmap, Jpeg, Radiance, Tiff and \
Gif images."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-3.3.8-1.3.aarch64.rpm"
RPM_HASH = "e3c57290248272005bdabc5e1f7a6500a7d9435b5d5bfee2e955472594e1ce3e36f8821cc905c92f5614e10d860c7bf60539c30012605879ce3921a432df7d86"

RPROVIDES:${PN} += "ghc-JuicyPixels \
libHSJuicyPixels-3.3.8-BQPF2mBCFFj3rGPaZ8nrGS-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libHSzlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
