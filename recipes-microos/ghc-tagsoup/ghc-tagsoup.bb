SUMMARY = "Parsing and extracting information from (possibly malformed) HTML/XML documents"
DESCRIPTION = "TagSoup is a library for parsing HTML/XML. It supports the HTML 5 \
specification, and can be used to parse either well-formed XML, or unstructured \
and malformed HTML from the web. The library also provides useful functions to \
extract information from an HTML document, making it ideal for screen-scraping. \
 \
Users should start from the 'Text.HTML.TagSoup' module."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-0.14.8-6.3.aarch64.rpm"
RPM_HASH = "12509913ba09605f984e1cc1ac461c457882dad154cb1297514229d1284761999dd2b7ab09d0a82c7a32b06a7f4b77310e6f25b130c16f5209ca5ce4b5b162a1"

RPROVIDES:${PN} += "ghc-tagsoup \
ghc-tagsoup(aarch-64) \
libHStagsoup-0.14.8-KqOLe3dJpuA4KsHZJW2cTn-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
