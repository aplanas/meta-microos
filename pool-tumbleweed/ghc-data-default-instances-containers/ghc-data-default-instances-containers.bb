SUMMARY = "Default instances for types in containers"
DESCRIPTION = "Default instances for types in containers."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "e721ac69423a4620b3f762d6ffbe12b41c498c1d82d211ef1dd4060aa346840c72a8c2fa8d05b9c270ab7ac06c75de9c784d4568fcfd818c0abd79551b42211a"

RPROVIDES:${PN} += "ghc-data-default-instances-containers \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
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
