SUMMARY = "Handle Jira wiki markup"
DESCRIPTION = "Parse jira wiki text into an abstract syntax tree for easy transformation to \
other formats."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ghc-jira-wiki-markup-1.5.1-1.8.aarch64.rpm"
RPM_HASH = "05f13c2fe97cdccc57cdf5d3795c5ccd63ff1a0452c19247746bc3435f7c5e235ba1cc2dcabbdc2d243846c12feebcff767ddafaed750e68ccc9871ba944f3e9"

RPROVIDES:${PN} += "ghc-jira-wiki-markup \
libHSjira-wiki-markup-1.5.1-Kpl2oQNac464TohGq5hnAO-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
