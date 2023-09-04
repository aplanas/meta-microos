SUMMARY = "Portable POSIX-compatibility layer"
DESCRIPTION = "This package provides portable implementations of parts of the unix package. \
This package re-exports the unix package when available. When it isn't \
available, portable implementations are used."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-0.6-3.8.aarch64.rpm"
RPM_HASH = "5b9dc88f0618e95e6d3d83490a8e79c8186d1a6ce99170fcbea3ccbb26d4651da9420cce8943166347938e04b682db220bd75bdfe17b35ff06bb77b8d728f604"

RPROVIDES:${PN} += "ghc-unix-compat \
libHSunix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei-ghc9.4.6.so"

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
