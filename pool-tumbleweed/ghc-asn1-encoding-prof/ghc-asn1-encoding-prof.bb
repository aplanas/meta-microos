SUMMARY = "Haskell asn1-encoding profiling library"
DESCRIPTION = "This package provides the Haskell asn1-encoding profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-prof-0.9.6-8.6.aarch64.rpm"
RPM_HASH = "ebcee0a74fe2e653a9382d4c01bac00d9ffcd6f1fd0ca33a22e4589c2e546fa273749d23d116ff05ca74673c509395c951f5f8d7e8233e3a47ab271280f47752"

RPROVIDES:${PN} += "ghc-asn1-encoding-prof \
ghc-prof-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt"

RDEPENDS:${PN} += "ghc-asn1-encoding-devel \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3"

inherit rpm
