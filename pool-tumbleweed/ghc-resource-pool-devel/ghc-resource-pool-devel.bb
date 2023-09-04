SUMMARY = "Haskell resource-pool library development files"
DESCRIPTION = "This package provides the Haskell resource-pool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-devel-0.4.0.0-2.9.aarch64.rpm"
RPM_HASH = "d793c699bf640e5da617df73cd131686d157f6e7d64b3ef1b26bb497ea5a401d8d3bd31e043cdcba441d1af484d9688130ab0f80b597bcf9a1cb4b39c3771cd6"

RPROVIDES:${PN} += "ghc-devel-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-resource-pool-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-time-1.12.2 \
ghc-resource-pool"

inherit rpm
