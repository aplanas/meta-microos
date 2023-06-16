SUMMARY = "Haskell tasty-hunit library development files"
DESCRIPTION = "This package provides the Haskell tasty-hunit library development files."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-devel-0.10.0.3-2.2.aarch64.rpm"
RPM_HASH = "8419e5aa1c285b8e052b4955f35677562aae4195f3190da1af56dc92984ad53cf47218db610ad160f23321a12558b479aae50e765c284bc6f95ffb4e918f22dd"

RPROVIDES:${PN} += "ghc-devel-tasty-hunit-0.10.0.3-CV9N1Lkn3CAEveU82YsKyL \
ghc-tasty-hunit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz \
ghc-tasty-hunit"

inherit rpm
