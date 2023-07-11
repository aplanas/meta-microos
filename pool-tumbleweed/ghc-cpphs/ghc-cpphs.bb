SUMMARY = "Haskell cpphs library"
DESCRIPTION = "This package provides the Haskell cpphs shared library."
LICENSE = "LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-1.20.9.1-5.6.aarch64.rpm"
RPM_HASH = "b315118ee316f529b5b8962efda233906f3ecca462da22aafab4eaba55262e703beda692da1d8a51c72f356032b533346dedd95c8b74bf31414cf0b8a5a9f60e"

RPROVIDES:${PN} += "ghc-cpphs \
libHScpphs-1.20.9.1-FT5N79IhkR98KU1k959mgj-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpolyparse-1.13-E8FdqtcSqxM3P2njDFrYm8-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
