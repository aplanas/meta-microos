SUMMARY = "Haskell cprng-aes profiling library"
DESCRIPTION = "This package provides the Haskell cprng-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-prof-0.6.1-4.3.aarch64.rpm"
RPM_HASH = "fe5a4f3aaf79c40ff76995c1cae917c9e9fd65ab87957ce36e8aef22b4e7a27caed7b1d7e5df6ff02085b478964029fd50f273390b186d829d006cc55b0904a2"

RPROVIDES:${PN} += "ghc-cprng-aes-prof \
ghc-prof-cprng-aes-0.6.1-57mLrS8iLhhDpycOALP7vk"

RDEPENDS:${PN} += "ghc-cprng-aes-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cipher-aes-0.2.11-AUtsAMArdsjvHtn454bNK \
ghc-prof-crypto-random-0.0.9-60vlsiR41hHGmZ9VjOCRvw"

inherit rpm
