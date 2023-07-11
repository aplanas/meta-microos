SUMMARY = "Haskell asn1-parse profiling library"
DESCRIPTION = "This package provides the Haskell asn1-parse profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-prof-0.9.5-6.3.aarch64.rpm"
RPM_HASH = "089f7625ded30ab3b318a296805b828a649e58c5e545612c49aaab65124d3d6c693ce7564c6a4cff60d369bc1bb0f5d5b673cdbefea6eb98f53a848505dd3385"

RPROVIDES:${PN} += "ghc-asn1-parse-prof \
ghc-prof-asn1-parse-0.9.5-HTg4KkpVBwF8NdUaqkTqJm"

RDEPENDS:${PN} += "ghc-asn1-parse-devel \
ghc-prof-asn1-encoding-0.9.6-Cdk8qspuM85LY571XnsXDt \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
