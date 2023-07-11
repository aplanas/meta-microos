SUMMARY = "Haskell attoparsec-iso8601 profiling library"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-prof-1.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "ebe813e01b69e1239fbe06a2fd83abc3e7350240461d0689c7af80006924b23977f265d6dc68fc2a57d48d9c1858b22e84a9d9214b6fb238cbad6c3486d37ab3"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-prof \
ghc-prof-attoparsec-iso8601-1.1.0.0-7warWbAa4NQL4IDzyErxXZ"

RDEPENDS:${PN} += "ghc-attoparsec-iso8601-devel \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82"

inherit rpm
