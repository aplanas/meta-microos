SUMMARY = "Haskell recv profiling library"
DESCRIPTION = "This package provides the Haskell recv profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-recv-prof-0.1.0-1.7.aarch64.rpm"
RPM_HASH = "45cdf545e5451195d0cbf2582f913bb97b9f6b0bf03e9b6ff5cd8480c0240dc5a64ecd0d557d94cd3d88e576b66e78f5794a68e01fc1da1bd588cceb1bdc6a2d"

RPROVIDES:${PN} += "ghc-prof-recv-0.1.0-5l0GOJwksOA59K6H5tIdgO \
ghc-recv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-recv-devel"

inherit rpm
