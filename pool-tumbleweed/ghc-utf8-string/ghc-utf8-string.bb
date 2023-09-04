SUMMARY = "Support for reading and writing UTF8 Strings"
DESCRIPTION = "A UTF8 layer for Strings. The utf8-string package provides operations for \
encoding UTF8 strings to Word8 lists and back, and for reading and writing UTF8 \
without truncation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "0f36d018956e77968e022508d06085d7e1ec3fea71656869a0e592212462713ec48950e2331d9a06c44f64ebbdfb272aeb8b46488f12c3db3d8091a06fd2e109"

RPROVIDES:${PN} += "ghc-utf8-string \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
