SUMMARY = "Default instances for types in dlist"
DESCRIPTION = "Default instances for types in dlist."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-0.0.1-11.3.aarch64.rpm"
RPM_HASH = "9d06548799f75f784383f7a3ac759862d3db036cafcd3673f482aa27522b3b7302c0ab756673d00a87ebc00c14ca6ae5979ab4909f434a7b1a013e465172cf8f"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
