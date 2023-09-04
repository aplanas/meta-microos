SUMMARY = "Parsing and extracting information from (possibly malformed) HTML/XML documents"
DESCRIPTION = "TagSoup is a library for parsing HTML/XML. It supports the HTML 5 \
specification, and can be used to parse either well-formed XML, or unstructured \
and malformed HTML from the web. The library also provides useful functions to \
extract information from an HTML document, making it ideal for screen-scraping. \
 \
Users should start from the 'Text.HTML.TagSoup' module."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-0.14.8-6.8.aarch64.rpm"
RPM_HASH = "1fb6a1b57597a1698edc101fc300bec3fe4c9bf161ee5ad8ac4a900743b95de264036c3f7237cb95f15c9fda92844ba3067faf8985a25a865d72eb1afbd04883"

RPROVIDES:${PN} += "ghc-tagsoup \
libHStagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
