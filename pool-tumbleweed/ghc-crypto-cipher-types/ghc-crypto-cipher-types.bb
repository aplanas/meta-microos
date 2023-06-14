SUMMARY = "Generic cryptography cipher types"
DESCRIPTION = "Generic cryptography cipher types."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-0.0.9-4.3.aarch64.rpm"
RPM_HASH = "ce5b0f8ec4ca07d0ebc339ceca93c161017fafe67ac7b4f332514f852221ec83c919506f1da623eecb3b3adf7eaf572981d425d113134527c11a3413f5eda4f9"

RPROVIDES:${PN} += "ghc-crypto-cipher-types \
libHScrypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-2DG6nqjfLMK4MSR77XYQqL-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSsecuremem-0.1.10-BbcWu3otOS6JQaPW3JfszZ-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
