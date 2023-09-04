SUMMARY = "Picture loading/serialization (in png, jpeg, bitmap, gif, tga, tiff and radiance)"
DESCRIPTION = "This library can load and store images in PNG,Bitmap, Jpeg, Radiance, Tiff and \
Gif images."
LICENSE = "BSD-3-Clause"

PV = "3.3.8"

RPM_NAME = "ghc-JuicyPixels-3.3.8-1.8.aarch64.rpm"
RPM_HASH = "c348bf56971e441d913ec756c81216a4efbf6409bbbcb7181dba52182e3fd6fe75ebaebeba99af9ba3d105ce90abcf676dedb850e0b44abdc41cf30c460abc8d"

RPROVIDES:${PN} += "ghc-JuicyPixels \
libHSJuicyPixels-3.3.8-FOv2aUt11Hi1sMHjbd6508-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libHSzlib-0.6.3.0-ENQBvbHWSlQ4ss0TzRHRuj-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
