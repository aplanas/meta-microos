SUMMARY = "Portable POSIX-compatibility layer"
DESCRIPTION = "This package provides portable implementations of parts of the unix package. \
This package re-exports the unix package when available. When it isn't \
available, portable implementations are used."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-0.6-3.3.aarch64.rpm"
RPM_HASH = "16c3bfdda18a439f0e2f6439bf7914c3c6a7b36a7bc80f08aa1bd72c6ecb36fc7b0053c172547093d77780cd02a801d22d6b957290edfc73b6471e15073c5afc"

RPROVIDES:${PN} += "ghc-unix-compat \
ghc-unix-compat(aarch-64) \
libHSunix-compat-0.6-79KxxZMmklx25hsmeEnenN-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
