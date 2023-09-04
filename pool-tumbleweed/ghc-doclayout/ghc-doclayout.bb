SUMMARY = "A prettyprinting library for laying out text documents"
DESCRIPTION = "Doclayout is a prettyprinting library for laying out text documents, with \
several features not present in prettyprinting libraries designed for code. \
It was designed for use in pandoc."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-0.4.0.1-1.4.aarch64.rpm"
RPM_HASH = "e0538b311b8baf61275a0b11718d2a4b711b61433a5179d36ecd7dda0f1e789c6fe2fd8b373caf8d928964714f8fa0c84ad47431baa90fac6d42c045fbb4d455"

RPROVIDES:${PN} += "ghc-doclayout \
libHSdoclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSemojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsafe-0.3.19-9uHvZjuyLiR13wOGSONZxX-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
