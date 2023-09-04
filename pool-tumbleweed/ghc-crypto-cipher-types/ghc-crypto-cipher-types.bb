SUMMARY = "Generic cryptography cipher types"
DESCRIPTION = "Generic cryptography cipher types."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-0.0.9-4.8.aarch64.rpm"
RPM_HASH = "a10fc12b8bfd37462321311cdba9b14052ac221b9ceaab66d434ec73f07869af3482ea6cee2b2ed3d337d3b9343934aa8e5b2cc9343c744df46c163fb3b2a612"

RPROVIDES:${PN} += "ghc-crypto-cipher-types \
libHScrypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbasement-0.0.16-JDtFhm6hoERETf7Hqk4dh9-ghc9.4.6.so \
libHSbyteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmemory-0.18.0-6jbQrbksm9m3FIftlSlmf1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsecuremem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
