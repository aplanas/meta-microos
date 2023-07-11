SUMMARY = "Haskell binary library"
DESCRIPTION = "This package provides the Haskell binary library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-0.8.9.1-3.2.aarch64.rpm"
RPM_HASH = "261065703134ada6a03512d988ea9f90fe56e46f61e3e85dc0b3b33b5f1a31a8c1a28d85be54737fced8b27d146be28864a4910c47a74a3ee5e7c5878e9b91e1"

RPROVIDES:${PN} += "ghc-binary \
libHSbinary-0.8.9.1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
