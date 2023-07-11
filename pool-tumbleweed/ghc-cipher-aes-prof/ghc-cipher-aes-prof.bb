SUMMARY = "Haskell cipher-aes profiling library"
DESCRIPTION = "This package provides the Haskell cipher-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-prof-0.2.11-4.4.aarch64.rpm"
RPM_HASH = "56d2157c39d106674a5246a27f68e9bd8d069cedfb0c9faf346eeff7646e0da186c6aedce846dec8cf8c23882a28ca83397d4ad045674f16c49e667cee9e425c"

RPROVIDES:${PN} += "ghc-cipher-aes-prof \
ghc-prof-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK"

RDEPENDS:${PN} += "ghc-cipher-aes-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-crypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz \
ghc-prof-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu"

inherit rpm
