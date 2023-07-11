SUMMARY = "Haskell cprng-aes library development files"
DESCRIPTION = "This package provides the Haskell cprng-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-devel-0.6.1-4.3.aarch64.rpm"
RPM_HASH = "13478e6d9b6521b236ebd7a7282832f65891df5b0c229316cd70775cd65fe41016912b62cf9959debc6a61e012a1c06d36f8ddf18f8cc7e215a60477ecc42400"

RPROVIDES:${PN} += "ghc-cprng-aes-devel \
ghc-devel-cprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cprng-aes \
ghc-devel-base-4.17.1.0 \
ghc-devel-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK \
ghc-devel-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw"

inherit rpm
