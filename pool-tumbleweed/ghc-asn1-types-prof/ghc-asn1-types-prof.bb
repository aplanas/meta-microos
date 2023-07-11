SUMMARY = "Haskell asn1-types profiling library"
DESCRIPTION = "This package provides the Haskell asn1-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-prof-0.3.4-5.6.aarch64.rpm"
RPM_HASH = "a284629e36c1778159cbbf1ceeba77d307a150619a8ac55446c1565a2cdeaebb761d0dbb6f757bd1fb507a8f1f0d18ad5a9a1adf75e0561f6bdaeca7648857ea"

RPROVIDES:${PN} += "ghc-asn1-types-prof \
ghc-prof-asn1-types-0.3.4-4LX8ePpAyEC5pdyYoIADjx"

RDEPENDS:${PN} += "ghc-asn1-types-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp"

inherit rpm
