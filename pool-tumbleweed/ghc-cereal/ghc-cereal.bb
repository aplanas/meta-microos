SUMMARY = "A binary serialization library"
DESCRIPTION = "A binary serialization library, similar to binary, that introduces an isolate \
primitive for parser isolation, and labeled blocks for better error messages."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-0.5.8.3-2.8.aarch64.rpm"
RPM_HASH = "16ddcb2f40b372374059121f05fbe98d61e260ade280f0e70e9ca0c0657eace013c9b9c8061abe91a2ace82e7504ff0112c57ed743e02d802229311b82bc5249"

RPROVIDES:${PN} += "ghc-cereal \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
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
