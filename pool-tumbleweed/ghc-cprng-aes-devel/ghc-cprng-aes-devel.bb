SUMMARY = "Haskell cprng-aes library development files"
DESCRIPTION = "This package provides the Haskell cprng-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-devel-0.6.1-5.1.aarch64.rpm"
RPM_HASH = "c5edfeff44414bb4527e265c3ae5594223f91d354f928399ae2cf8629bc9b2b0b7872b686b1dcc5c3d5c0959204237b19fec2c99ecf3f9cd7a3510933d2cc2f4"

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
