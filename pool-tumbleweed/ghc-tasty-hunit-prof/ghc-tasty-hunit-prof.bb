SUMMARY = "Haskell tasty-hunit profiling library"
DESCRIPTION = "This package provides the Haskell tasty-hunit profiling library."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-prof-0.10.0.3-2.3.aarch64.rpm"
RPM_HASH = "ff55d3490c66bb7f2be956cefd5592050cff3c2cbc069a26b83dec6fd29d4412980ad4d5d9606609b5f6077f35b75effb694d80ea8480c87833c95e05e5a224d"

RPROVIDES:${PN} += "ghc-prof-tasty-hunit-0.10.0.3-6X5qFyvC3YwCq8i9tfXsji \
ghc-tasty-hunit-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-prof-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-tasty-hunit-devel"

inherit rpm
