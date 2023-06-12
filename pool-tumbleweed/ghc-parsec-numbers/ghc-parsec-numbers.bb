SUMMARY = "Utilities for parsing numbers from strings"
DESCRIPTION = "Parsec-numbers provides the number parsers without the need to use a large (and \
unportable) token parser."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-0.1.0-7.2.aarch64.rpm"
RPM_HASH = "45579ca35a194d8feeb42ab638be0c0ff0c83a459ad336208b7f0e6746f7458fc27834b172b1c5b07c658b52f830ef8720fcd65c41f3e1415924f68c73dcb7f0"

RPROVIDES:${PN} += "ghc-parsec-numbers \
ghc-parsec-numbers(aarch-64) \
libHSparsec-numbers-0.1.0-EpxP3vMK5SifJrb3FqKTJ-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
