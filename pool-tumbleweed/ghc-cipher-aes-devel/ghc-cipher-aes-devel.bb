SUMMARY = "Haskell cipher-aes library development files"
DESCRIPTION = "This package provides the Haskell cipher-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-devel-0.2.11-4.4.aarch64.rpm"
RPM_HASH = "89c732aa78607b7a3b376cd78d2f2b5599a7e145849bd740cd19175b1189e7c6566e7ecc975d03c7ca17129168aa60fcec5771977b69f3b420010a09562c9b26"

RPROVIDES:${PN} += "ghc-cipher-aes-devel \
ghc-devel-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cipher-aes \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-crypto-cipher-types-0.0.9-9ncnLpjReeQDgkKFRi4kUz \
ghc-devel-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu"

inherit rpm
