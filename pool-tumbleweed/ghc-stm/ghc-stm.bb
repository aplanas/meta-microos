SUMMARY = "Haskell stm library"
DESCRIPTION = "This package provides the Haskell stm library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-2.5.1.0-3.2.aarch64.rpm"
RPM_HASH = "3f98f1eb85da3ba4b08dc23954f353fdcf9428d5ad1ecee318398b53068ea6e7a669f95f777b4179406fc47cd2a97dc93973ae9b34320a259999be055e028495"

RPROVIDES:${PN} += "ghc-stm \
libHSstm-2.5.1.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
