SUMMARY = "Haskell process library"
DESCRIPTION = "This package provides the Haskell process library."
LICENSE = "BSD-3-Clause"

PV = "1.6.17.0"

RPM_NAME = "ghc-process-1.6.17.0-1.1.aarch64.rpm"
RPM_HASH = "f62fecae64430a5d7db7909b386cb438023a0c86021f959979da06bdea949101b35ca064f97025cae364ebe1ac29af7967d2957c5775f49b6c971faae28062df"

RPROVIDES:${PN} += "ghc-process \
libHSprocess-1.6.17.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
