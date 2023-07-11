SUMMARY = "Haskell ghc-compact profiling library"
DESCRIPTION = "This package provides the Haskell ghc-compact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-prof-0.1.0.0-3.2.aarch64.rpm"
RPM_HASH = "9800cb97ee1ea6b1f150b9bb49e98f91db90b014ceb1bfb89d56db4762d8e310072961c4fe6fc80eeb12606e87387e50d7ff4af8292523e17745c3d88bf5384c"

RPROVIDES:${PN} += "ghc-ghc-compact-prof \
ghc-prof-ghc-compact-0.1.0.0"

RDEPENDS:${PN} += "ghc-ghc-compact-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
