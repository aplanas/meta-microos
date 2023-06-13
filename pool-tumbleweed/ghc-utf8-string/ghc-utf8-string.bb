SUMMARY = "Support for reading and writing UTF8 Strings"
DESCRIPTION = "A UTF8 layer for Strings. The utf8-string package provides operations for \
encoding UTF8 strings to Word8 lists and back, and for reading and writing UTF8 \
without truncation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-1.0.2-2.3.aarch64.rpm"
RPM_HASH = "001df58273cd34e186cf306018ac404b6d9d5349214775249e21db2e070709b40df20fa46bd98f594ad0ac82a3d9e4fc006aa3d2fa1bca408af20c0a56ebf03e"

RPROVIDES:${PN} += "ghc-utf8-string \
ghc-utf8-string(aarch-64) \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
