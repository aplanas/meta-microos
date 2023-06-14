SUMMARY = "Haskell parsec profiling library"
DESCRIPTION = "This package provides the Haskell parsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-prof-3.1.16.1-3.1.aarch64.rpm"
RPM_HASH = "26eaed0816c75b13a6b0829640ec3b6a340d89ef64e27ba2d7ac7b34c3a7ac69218e2d95e77f93b354c7925096cbbff46b71b216cf1c35ef71bea86a8fe42fff"

RPROVIDES:${PN} += "ghc-parsec-prof \
ghc-prof-parsec-3.1.16.1"

RDEPENDS:${PN} += "ghc-parsec-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
