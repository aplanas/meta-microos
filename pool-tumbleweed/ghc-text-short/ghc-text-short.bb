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

RPM_NAME = "ghc-text-short-0.1.5-3.8.aarch64.rpm"
RPM_HASH = "c6eb5808dada7185ec659b5cadc8d352d54b727c098266583b5eef41b9372abb15907343b65a60446e26623ab882206ccedaafdd83e5eb4b4c901adaa2d71552"

RPROVIDES:${PN} += "ghc-text-short \
libHStext-short-0.1.5-1JafpcPTh6A5I5aikDr3ez-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
