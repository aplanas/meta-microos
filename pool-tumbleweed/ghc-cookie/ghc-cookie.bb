SUMMARY = "HTTP cookie parsing and rendering"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <https://www.stackage.org/package/cookie>."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "ghc-cookie-0.4.6-2.2.aarch64.rpm"
RPM_HASH = "0fccf2f8cb86463b44698b64ed42c47c79b8edcd27fdcd35199084ec2ed8bcb43796f45e1581c5d47951e98f9f8ff6a059897823d739e0de5a5d065afcf63d7c"

RPROVIDES:${PN} += "ghc-cookie \
libHScookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
