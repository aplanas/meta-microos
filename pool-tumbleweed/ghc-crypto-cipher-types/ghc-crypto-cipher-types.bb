SUMMARY = "Generic cryptography cipher types"
DESCRIPTION = "Generic cryptography cipher types."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-0.0.9-4.6.aarch64.rpm"
RPM_HASH = "3012b27cb9b227dce824695cbc023d792ec6ebd4853696a0dfed4525ad2369c725a9c8c91fc80760fc58724576ef247d605344f1a8a751120a0203178d933aa9"

RPROVIDES:${PN} += "ghc-crypto-cipher-types \
libHScrypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbasement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn-ghc9.4.5.so \
libHSbyteable-0.1.1-KSaZugJOm4ALb4WyX9cufg-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmemory-0.18.0-8CsggfkyXReDSMbRoae4Yp-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSsecuremem-0.1.10-14D6arGPELi9Mzd7V4Fyfu-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
