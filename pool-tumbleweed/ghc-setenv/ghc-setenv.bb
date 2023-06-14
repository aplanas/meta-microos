SUMMARY = "A cross-platform library for setting environment variables"
DESCRIPTION = "A cross-platform library for setting environment variables \
 \
Note: Since 'base-4.7.0.0' the functions 'setEnv' and 'unsetEnv' are provided \
by 'System.Environment'. 'System.SetEnv' merily re-exports those functions when \
built with 'base >= 4.7'."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-0.1.1.3-12.2.aarch64.rpm"
RPM_HASH = "c19fe90fe6b40f8a86c04617ca30bd74383cf4f6427047598c3bb644e1a5d9b7f8b274bf4921746d9bca3e53235ba385671d3602d8e925b7a31514910da090ef"

RPROVIDES:${PN} += "ghc-setenv \
libHSsetenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
