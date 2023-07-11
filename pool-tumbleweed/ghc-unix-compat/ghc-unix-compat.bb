SUMMARY = "Portable POSIX-compatibility layer"
DESCRIPTION = "This package provides portable implementations of parts of the unix package. \
This package re-exports the unix package when available. When it isn't \
available, portable implementations are used."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-0.6-3.6.aarch64.rpm"
RPM_HASH = "dc561b2e6c805b6dc5e9974182ad4e7e963f2474460902d75735b883487a6327d7c827152f042be9b1011eb9af1fef04205e0fe0286801a7809bc9ab14885fc6"

RPROVIDES:${PN} += "ghc-unix-compat \
libHSunix-compat-0.6-79KxxZMmklx25hsmeEnenN-ghc9.4.5.so"

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
