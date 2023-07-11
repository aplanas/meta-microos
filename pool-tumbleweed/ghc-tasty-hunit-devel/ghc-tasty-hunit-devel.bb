SUMMARY = "Haskell tasty-hunit library development files"
DESCRIPTION = "This package provides the Haskell tasty-hunit library development files."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-devel-0.10.0.3-2.3.aarch64.rpm"
RPM_HASH = "7c5637847bc40b915983fe3c3e3e4417e3aa6a96af68a1a8f09b92cace30eef6ae9d19fe5a19071345745d4743f32cb161b523288f3b5310e45eed46e80c5186"

RPROVIDES:${PN} += "ghc-devel-tasty-hunit-0.10.0.3-6X5qFyvC3YwCq8i9tfXsji \
ghc-tasty-hunit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-tasty-hunit"

inherit rpm
