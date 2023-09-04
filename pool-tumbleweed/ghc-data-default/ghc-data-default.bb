SUMMARY = "A class for types with a default value"
DESCRIPTION = "A class for types with a default value."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-0.7.1.1-10.3.aarch64.rpm"
RPM_HASH = "a0d7d346641ef44c289ea5d778ed34192a47fb7c118fe2dcb6065302cf69a2f325cb509b5ad4f304be5aaf084c5bee71c925cb436024dc5087dd8f9c2cbd60fd"

RPROVIDES:${PN} += "ghc-data-default \
libHSdata-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdata-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN-ghc9.4.6.so \
libHSdata-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1-ghc9.4.6.so \
libHSdata-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk-ghc9.4.6.so \
libHSdata-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
