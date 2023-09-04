SUMMARY = "A simple XML library"
DESCRIPTION = "A simple XML library."
LICENSE = "BSD-3-Clause"

PV = "1.3.14"

RPM_NAME = "ghc-xml-1.3.14-13.8.aarch64.rpm"
RPM_HASH = "16486ffd48dcfbd3c76032eecf44c63bb8824caee30da947a1566582e2c7c327d09afe9c07e7e36af37afebde14c8fef54e309545b1758645d5b8dfed57ebd4a"

RPROVIDES:${PN} += "ghc-xml \
libHSxml-1.3.14-JgZFWdUND2BGObIBmJlnFJ-ghc9.4.6.so"

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
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
