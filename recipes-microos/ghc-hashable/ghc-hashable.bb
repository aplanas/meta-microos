SUMMARY = "A class for types that can be converted to a hash value"
DESCRIPTION = "This package defines a class, 'Hashable', for types that can be converted to a \
hash value. This class exists for the benefit of hashing-based data structures. \
The package provides instances for basic types and a way to combine hash \
values."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-1.4.2.0-1.3.aarch64.rpm"
RPM_HASH = "09eea05d69b69e4f582fce787905aa92efc7ac83b3ee953dc034eb4e34f11db2da91f5c65f1ac062789b5c2d1883b44c5159c5b4e892c62fd2705ba277b24dac"

RPROVIDES:${PN} += "ghc-hashable ghc-hashable(aarch-64) libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
