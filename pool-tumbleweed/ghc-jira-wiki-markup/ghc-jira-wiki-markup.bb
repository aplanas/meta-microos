SUMMARY = "Handle Jira wiki markup"
DESCRIPTION = "Parse jira wiki text into an abstract syntax tree for easy transformation to \
other formats."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-1.5.1-1.6.aarch64.rpm"
RPM_HASH = "36cbe741ee13d4be4ab9e6f3abfe1565852f567da7d0c20e3e638540ce1ba6b89379f6da3e28ec60b8ff59f1455c12919311c01227c6da36e8c11e383d2274ac"

RPROVIDES:${PN} += "ghc-jira-wiki-markup \
libHSjira-wiki-markup-1.5.1-7ePG3tP2CY82wODfjMZ5nH-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
