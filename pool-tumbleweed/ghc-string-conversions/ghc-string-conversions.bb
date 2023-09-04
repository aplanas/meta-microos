SUMMARY = "Simplifies dealing with different types for strings"
DESCRIPTION = "Provides a simple type class for converting values of different string types \
into values of other string types."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-0.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "ff718fa66ece89e9b3cfd6588b514eab9e59ec0d819fac1da3ae60fc173e52244430e39ef0c30cda5daa56b4973924f41f5e60db4083592ceccdf86143359c72"

RPROVIDES:${PN} += "ghc-string-conversions \
libHSstring-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink-ghc9.4.6.so"

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
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
