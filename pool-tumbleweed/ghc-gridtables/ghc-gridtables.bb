SUMMARY = "Parser for reStructuredText-style grid tables"
DESCRIPTION = "Provides a parser for plain-text representations of tables. This package \
supports table headers, cells spanning multiple columns or rows, as well as a \
way to specfiy column alignments."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-0.1.0.0-1.2.aarch64.rpm"
RPM_HASH = "6101c69e67934cb70b846d3ba19527b1ef7e676788b9f35d413918b53b559e723612e14fad956f1d5ee47d7e4287a0e478ba084bbbe8d1ef47ec221dd9417859"

RPROVIDES:${PN} += "ghc-gridtables \
ghc-gridtables(aarch-64) \
libHSgridtables-0.1.0.0-I8M3kz7LaeTJ8iEjDWUjrS-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdoclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0-ghc9.4.5.so()(64bit) \
libHSemojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
