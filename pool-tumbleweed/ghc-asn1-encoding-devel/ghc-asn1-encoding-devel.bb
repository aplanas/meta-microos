SUMMARY = "Haskell asn1-encoding library development files"
DESCRIPTION = "This package provides the Haskell asn1-encoding library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-devel-0.9.6-8.6.aarch64.rpm"
RPM_HASH = "385819cf339665379627d7e4c2f3de1e9a81a8e3e99537294fc07c3e19b79d40a3f00ed5689b5f4fbaee1c67f96897f49c45ec0b1326885c471073c9be1f77eb"

RPROVIDES:${PN} += "ghc-asn1-encoding-devel \
ghc-devel-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-encoding \
ghc-compiler \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3"

inherit rpm
