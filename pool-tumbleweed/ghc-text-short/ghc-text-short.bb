SUMMARY = "Memory-efficient representation of Unicode text strings"
DESCRIPTION = "This package provides the 'ShortText' type which is suitable for keeping many \
short strings in memory. This is similiar to how 'ShortByteString' relates to \
'ByteString'. \
 \
The main difference between 'Text' and 'ShortText' is that 'ShortText' doesn't \
support zero-copy slicing (thereby saving 2 words), and, compared to text-1.*, \
that it uses UTF-8 instead of UTF-16 internally. Consequently, the memory \
footprint of a (boxed) 'ShortText' value is 4 words (2 words when unboxed) plus \
the length of the UTF-8 encoded payload."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-0.1.5-3.6.aarch64.rpm"
RPM_HASH = "f250c613d79893c7c721860fb3ca865cac8726496c99c8ff75f31b6e54ed4075033ed2a734121ca916b0d2d7467b8e2f2e0a42c8169d830fe87184936b638fef"

RPROVIDES:${PN} += "ghc-text-short \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
