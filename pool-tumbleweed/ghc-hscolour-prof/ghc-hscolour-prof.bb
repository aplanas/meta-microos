SUMMARY = "Haskell hscolour profiling library"
DESCRIPTION = "This package provides the Haskell hscolour profiling library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.4"

RPM_NAME = "ghc-hscolour-prof-1.24.4-4.3.aarch64.rpm"
RPM_HASH = "03e5451767f12de6e06e9d34e85c51cc89768c35b4613ad7bd3b8abed4f95afb41c820390daadd3d3ab7582b5300ca3b46c07d24977dade6d326094606de4525"

RPROVIDES:${PN} += "ghc-hscolour-prof \
ghc-hscolour-prof(aarch-64) \
ghc-prof(hscolour-1.24.4-B0NmEhYuPI790UQrsiXLka)"

RDEPENDS:${PN} += "ghc-hscolour-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7)"

inherit rpm
