SUMMARY = "Default instances for types in old-locale"
DESCRIPTION = "Default instances for types in old-locale."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "36cff5870f988ed36ebac451235a9f22b354ec3e96ad99d76afe3ed7c58f7e346e773ce46df30f24f6b5c99ac098b9e3cd4b65825bdd7998790ffae88eceb715"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
