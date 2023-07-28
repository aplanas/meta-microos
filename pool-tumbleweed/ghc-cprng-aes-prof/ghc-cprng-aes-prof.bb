SUMMARY = "Haskell cprng-aes profiling library"
DESCRIPTION = "This package provides the Haskell cprng-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-prof-0.6.1-5.1.aarch64.rpm"
RPM_HASH = "2920506bbd04cfd30ab62f416738dc2dbd47c58816907c8a2860ee71bb26c0954322cdf088e491d3a25ae91427be9e05b8a4d9d5a8ccae09837ffb076a2792ec"

RPROVIDES:${PN} += "ghc-cprng-aes-prof \
ghc-prof-cprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk"

RDEPENDS:${PN} += "ghc-cprng-aes-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK \
ghc-prof-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw"

inherit rpm
