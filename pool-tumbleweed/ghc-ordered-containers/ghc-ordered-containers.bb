SUMMARY = "Set- and Map-like types that remember the order elements were inserted"
DESCRIPTION = "Set- and Map-like types that remember the order elements were inserted."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-0.2.3-1.5.aarch64.rpm"
RPM_HASH = "36bc5a5d104bfe1ab6a1ea1cdb98b8fc6c4c8740e696256f376a820331817f17d0b350b399528e80fd7de9d07f3efe421f6595fe6bd491bf83df173b59a5016b"

RPROVIDES:${PN} += "ghc-ordered-containers \
libHSordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
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
