SUMMARY = "Components of paths"
DESCRIPTION = "Hackage documentation generation is not reliable. For up to date documentation, \
please see: <http://www.stackage.org/package/path-pieces>."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-0.2.1-12.3.aarch64.rpm"
RPM_HASH = "25318e328b83082902449fd4ea091a2e171aba69fa7e705ccc3ac96a738c94cea51df6a711e531aa060667d9d6971efc143581bf6b18f7340948f3c400cb060c"

RPROVIDES:${PN} += "ghc-path-pieces \
libHSpath-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n-ghc9.4.6.so"

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
libHStime-1.12.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
