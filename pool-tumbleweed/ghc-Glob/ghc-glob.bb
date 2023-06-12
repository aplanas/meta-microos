SUMMARY = "Globbing library"
DESCRIPTION = "A library for globbing: matching patterns against file paths."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-0.10.2-3.3.aarch64.rpm"
RPM_HASH = "a4748cd43bce7663fd3a0b89e036cfed315c003f12ef0c6a02bb4b7be7981625817c2c8f9d3fbf33bd2afb7d5058447d3ea7b19fb2d3a88042cb22404c3ce371"

RPROVIDES:${PN} += "ghc-Glob \
ghc-Glob(aarch-64) \
libHSGlob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
