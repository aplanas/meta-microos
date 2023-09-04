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

RPM_NAME = "ghc-mwc-random-0.15.0.2-3.8.aarch64.rpm"
RPM_HASH = "d24b61619053f7e712073b8afeba6967cbdb6c5501b2e91767674a5bead586cf117e57a3f3cb5feca9809b19ef6e83c5b984d2a728670ecf2e3140e8e4e41a73"

RPROVIDES:${PN} += "ghc-mwc-random \
libHSmwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmath-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHSrandom-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k-ghc9.4.6.so \
libHSsplitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
