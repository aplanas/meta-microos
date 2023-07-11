SUMMARY = "A binary serialization library"
DESCRIPTION = "A binary serialization library, similar to binary, that introduces an isolate \
primitive for parser isolation, and labeled blocks for better error messages."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-0.5.8.3-2.6.aarch64.rpm"
RPM_HASH = "9570fcc73ab37398adbb995a64bbdb4c544e8f5d405eeaa5c34ab3227cb8a6592e5834bfccea4c8b30c0fc0a9e917b16458b8f4901621fdc74f2aabb417f026a"

RPROVIDES:${PN} += "ghc-cereal \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so"

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
