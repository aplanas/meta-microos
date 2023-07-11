SUMMARY = "Haskell asn1-parse library development files"
DESCRIPTION = "This package provides the Haskell asn1-parse library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-devel-0.9.5-6.3.aarch64.rpm"
RPM_HASH = "742fc4722227ec625ed70ddfbe6e11fc951ce4eb6e3442abf19f3e3c279a39d4624b86a7f89bc2b2b1daed2a570d81cf7723c9ba4d42aec7b6bc6088f7f8af5e"

RPROVIDES:${PN} += "ghc-asn1-parse-devel \
ghc-devel-asn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-parse \
ghc-compiler \
ghc-devel-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-devel-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
