SUMMARY = "Fast, high quality pseudo random number generation"
DESCRIPTION = "This package contains code for generating high quality random numbers that \
follow either a uniform or normal distribution. The generated numbers are \
suitable for use in statistical applications. \
 \
The uniform PRNG uses Marsaglia's MWC256 (also known as MWC8222) \
multiply-with-carry generator, which has a period of 2^8222 and fares well in \
tests of randomness. It is also extremely fast, between 2 and 3 times faster \
than the Mersenne Twister. \
 \
Compared to the mersenne-random package, this package has a more convenient \
API, is faster, and supports more statistical distributions."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-0.15.0.2-3.6.aarch64.rpm"
RPM_HASH = "8db46f7665cef9cc4a9d89af0c0d8c67342092717042674bf78d3604740fd4eea614c67e0a89dea83b566da593f813e6e0abfdae25206af2ac486523523236b4"

RPROVIDES:${PN} += "ghc-mwc-random \
libHSmwc-random-0.15.0.2-ABcRZBX2kH9CBf1bhFwgAP-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmath-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
