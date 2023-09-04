SUMMARY = "Utilities for parsing numbers from strings"
DESCRIPTION = "Parsec-numbers provides the number parsers without the need to use a large (and \
unportable) token parser."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-0.1.0-7.3.aarch64.rpm"
RPM_HASH = "4ad7f01d14ad3d2e77462a26db2fda59bbfd5e86a5b3ce216b47c8d813f1233dbff5c9d82b6f815d679d8b8b65f1e1269be811ccde28650b9efd59b19f2dadf5"

RPROVIDES:${PN} += "ghc-parsec-numbers \
libHSparsec-numbers-0.1.0-JmfSOl7TbABbRzQTrD74l-ghc9.4.6.so"

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
libgmp.so.10 \
libm.so.6"

inherit rpm
