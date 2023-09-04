SUMMARY = "A cross-platform library for setting environment variables"
DESCRIPTION = "A cross-platform library for setting environment variables \
 \
Note: Since 'base-4.7.0.0' the functions 'setEnv' and 'unsetEnv' are provided \
by 'System.Environment'. 'System.SetEnv' merily re-exports those functions when \
built with 'base >= 4.7'."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-0.1.1.3-12.3.aarch64.rpm"
RPM_HASH = "4c2715377ed3bd51b55346be8b0665c9da768b9649a4c2d5c01a4552d9313f55652b0145df1d7e3b8e6ba142ff065b516cba48dca498d1b1a80548f282ddd27f"

RPROVIDES:${PN} += "ghc-setenv \
libHSsetenv-0.1.1.3-5X2tG8kGRXiEiTQvekWgx7-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
