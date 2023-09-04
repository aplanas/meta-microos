SUMMARY = "Haskell asn1-types profiling library"
DESCRIPTION = "This package provides the Haskell asn1-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-prof-0.3.4-5.8.aarch64.rpm"
RPM_HASH = "11465765bf94e937d90d1dcb2d4abb3c9efe855f51715db1d9fb6d8099b2ba47e541cdf938999856164365df5f503f8f4956ee929409aea82ce88ec9e7a97607"

RPROVIDES:${PN} += "ghc-asn1-types-prof \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in"

RDEPENDS:${PN} += "ghc-asn1-types-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1"

inherit rpm
