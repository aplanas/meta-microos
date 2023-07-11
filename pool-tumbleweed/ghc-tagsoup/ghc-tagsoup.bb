SUMMARY = "Parsing and extracting information from (possibly malformed) HTML/XML documents"
DESCRIPTION = "TagSoup is a library for parsing HTML/XML. It supports the HTML 5 \
specification, and can be used to parse either well-formed XML, or unstructured \
and malformed HTML from the web. The library also provides useful functions to \
extract information from an HTML document, making it ideal for screen-scraping. \
 \
Users should start from the 'Text.HTML.TagSoup' module."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-0.14.8-6.6.aarch64.rpm"
RPM_HASH = "b3e89f74adb82214031f3d14f7aa54dc6bf54a94b279e72eeb9e260f10b9ee3ecd87d28fb8f8228f47871cf74a42b7d25c5fc485ccef17209e4cfbebdf9799b3"

RPROVIDES:${PN} += "ghc-tagsoup \
libHStagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
