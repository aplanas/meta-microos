SUMMARY = "Haskell ghc-compact library"
DESCRIPTION = "This package provides the Haskell ghc-compact library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-0.1.0.0-1.1.aarch64.rpm"
RPM_HASH = "7a1a3fee6fe4879cabd62f7f6a7bacce72172a63e5c15c3caebdea7b6438858a8d818b8b8da2491fd93ea8128a95e5f06d12c3dd47be375e45f72c509a68287c"

RPROVIDES:${PN} += "ghc-ghc-compact \
libHSghc-compact-0.1.0.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
