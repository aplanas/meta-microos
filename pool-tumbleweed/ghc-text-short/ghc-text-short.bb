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

RPM_NAME = "ghc-text-short-0.1.5-3.3.aarch64.rpm"
RPM_HASH = "e2d81e68c53862be212f1cbb6b46f7c230e22647cf3f65b3f8837c8eeee863567d0b71b14f751fb7fefff1b05a33bea7d913316315b6514fb4ac86ce675785ab"

RPROVIDES:${PN} += "ghc-text-short \
ghc-text-short(aarch-64) \
libHStext-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
