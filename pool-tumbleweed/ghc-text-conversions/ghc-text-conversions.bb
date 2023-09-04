SUMMARY = "Safe conversions between textual types"
DESCRIPTION = "Safe conversions between textual types."
LICENSE = "ISC"

PV = "0.3.1.1"

RPM_NAME = "ghc-text-conversions-0.3.1.1-2.3.aarch64.rpm"
RPM_HASH = "2e1d34018e198636ca144351b07d0594e73d7f8a8d2591c136fb2e24f48494f86f473402d6a41b70bf0dcf994dcb663e9b33ff6fea62f5473607ecc76d8c6cbe"

RPROVIDES:${PN} += "ghc-text-conversions \
libHStext-conversions-0.3.1.1-HJG9QLMf9pVESk7Lf3iSH7-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ-ghc9.4.6.so \
libHSbase64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
