SUMMARY = "A class for types that can be converted to a hash value"
DESCRIPTION = "This package defines a class, 'Hashable', for types that can be converted to a \
hash value. This class exists for the benefit of hashing-based data structures. \
The package provides instances for basic types and a way to combine hash \
values."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-1.4.2.0-1.5.aarch64.rpm"
RPM_HASH = "480ce15ac59dc046617aac158d3b2015e5697d31f0ba2ded57e43992c1cf95b91a1d84a585ee67f4d6a5ee74ec9ae0ed6b7372def7466f7340df5c5906149b10"

RPROVIDES:${PN} += "ghc-hashable \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
