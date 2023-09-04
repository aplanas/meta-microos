SUMMARY = "A class for types that can be converted to a hash value"
DESCRIPTION = "This package defines a class, 'Hashable', for types that can be converted to a \
hash value. This class exists for the benefit of hashing-based data structures. \
The package provides instances for basic types and a way to combine hash \
values. \
 \
The 'Hashable' 'hash' values are not guaranteed to be stable across library \
versions, operating systems or architectures. For stable hashing use named \
hashes: SHA256, CRC32 etc."
LICENSE = "BSD-3-Clause"

PV = "1.4.3.0"

RPM_NAME = "ghc-hashable-1.4.3.0-1.3.aarch64.rpm"
RPM_HASH = "854b84cacec245b7cb34658da5216acc1ea951077ac8aada6723f1cead26cffe14d09efce7607b144bc74b86843b34e28c12bf2f9235251de783b2ca3fae90f2"

RPROVIDES:${PN} += "ghc-hashable \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
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
