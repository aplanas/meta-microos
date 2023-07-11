SUMMARY = "Haskell call-stack profiling library"
DESCRIPTION = "This package provides the Haskell call-stack profiling library."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-prof-0.4.0-2.6.aarch64.rpm"
RPM_HASH = "4ce91641ede97e781750462919ac58637a617c8ea2709a486937107b6d3f66f0243784a3d10b23c5b43f708596c5cc60377dcdd38f208f46284db68bf667c607"

RPROVIDES:${PN} += "ghc-call-stack-prof \
ghc-prof-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk"

RDEPENDS:${PN} += "ghc-call-stack-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
