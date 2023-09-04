SUMMARY = "Haskell cpphs library"
DESCRIPTION = "This package provides the Haskell cpphs shared library."
LICENSE = "LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-1.20.9.1-5.8.aarch64.rpm"
RPM_HASH = "f18ac4717d118e7ebcd10e0f5ec5f396da7862fd2cda439c686efbf705bf0ab0d56825e7facb6090fb84368188be4a41286a28741f49f415cc17d6ed53bd9fb3"

RPROVIDES:${PN} += "ghc-cpphs \
libHScpphs-1.20.9.1-21Hm230EH4MCmgim8IB00q-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpolyparse-1.13-BLB26XAC1GDzZMBJpPaUe-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
