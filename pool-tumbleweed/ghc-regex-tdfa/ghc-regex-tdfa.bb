SUMMARY = "Pure Haskell Tagged DFA Backend for 'Text.Regex' (regex-base)"
DESCRIPTION = "This package provides a pure Haskell 'Tagged' DFA regex engine for \
<//hackage.haskell.org/package/regex-base regex-base>. This implementation was \
inspired by the algorithm (and Master's thesis) behind the regular expression \
library known as <https://github.com/laurikari/tre/ TRE or libtre>. \
 \
Please consult the 'Text.Regex.TDFA' module for API documentation including a \
tutorial with usage examples; see also \
<https://wiki.haskell.org/Regular_expressions> for general information about \
regular expression support in Haskell."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-1.3.2.1-2.1.aarch64.rpm"
RPM_HASH = "1e8c2f9b4fcdee61bd050059b11bf8f3a5824f17fb410bbeeec51b2ac6abd6dd8d83031b0801bcee3fca751ac970f13c37df48c70e91bcde0a0a25f50a37482b"

RPROVIDES:${PN} += "ghc-regex-tdfa \
libHSregex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV-ghc9.4.5.so"

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
libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
