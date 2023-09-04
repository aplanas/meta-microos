SUMMARY = "Haskell bytestring library"
DESCRIPTION = "This package provides the Haskell bytestring library."
LICENSE = "BSD-3-Clause"

PV = "0.11.5.1"

RPM_NAME = "ghc-bytestring-0.11.5.1-1.1.aarch64.rpm"
RPM_HASH = "9338fc56d965e93da2f5728ab313cf2871948c209b90cc13322b5001f083c52a57f66e9b45014dff9ce92e406f556b6dc2a4d2da13993b549c7316ee38e4f950"

RPROVIDES:${PN} += "ghc-bytestring \
libHSbytestring-0.11.5.1-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
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
