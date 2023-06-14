SUMMARY = "Haskell process library"
DESCRIPTION = "This package provides the Haskell process library."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-1.6.16.0-3.1.aarch64.rpm"
RPM_HASH = "9237bd48353b92a4fd685f24eb290f5203f0ce49603cf407f4ccc8cae39b8bf1552dc0691505d89d65562d6c31503b0aaa7dbddeb3c221014bdd243f61aa043f"

RPROVIDES:${PN} += "ghc-process \
libHSprocess-1.6.16.0-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
