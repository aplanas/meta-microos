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

PV = "1.3.2"

RPM_NAME = "ghc-regex-tdfa-1.3.2-2.3.aarch64.rpm"
RPM_HASH = "a545fe840f74aa8dbe6c6105d5dec5dc45c69dd0658a7513b888484daaa5acbae1cf976e989e5210ea990eba75899601830eb527240e22d7733bd01f18bb656e"

RPROVIDES:${PN} += "ghc-regex-tdfa ghc-regex-tdfa(aarch-64) libHSregex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSregex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
