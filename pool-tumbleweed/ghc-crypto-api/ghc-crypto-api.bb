SUMMARY = "A generic interface for cryptographic operations"
DESCRIPTION = "A generic interface for cryptographic operations (hashes, ciphers, randomness). \
Maintainers of hash and cipher implementations are encouraged to add instances \
for the classes defined in Crypto.Classes. Crypto users are similarly \
encouraged to use the interfaces defined in the Classes module. Any concepts or \
functions of general use to more than one cryptographic algorithm (ex: padding) \
is within scope of this package."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-crypto-api-0.13.3-5.6.aarch64.rpm"
RPM_HASH = "82866d4981eb12a70a35f50a46655d53c54d33b5952d1cc0fc9e53d13b0e9715761ad26295ed6d4e890c6dc43bb255ec3f200b700de2b75a539a052a4e3a66cf"

RPROVIDES:${PN} += "ghc-crypto-api \
libHScrypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSentropy-0.4.1.10-HkaMHQZP8nyRj15panvtP-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
