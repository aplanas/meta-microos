SUMMARY = "Haskell call-stack library development files"
DESCRIPTION = "This package provides the Haskell call-stack library development files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-devel-0.4.0-2.3.aarch64.rpm"
RPM_HASH = "0e7d58d6565acff324d60806a44cd7df76d63cefdb81e353a98583f662b6c6d8756ed526902376d23d7dbf1946f2c7b71ff7d8837b0a885c5a339a16e8179219"

RPROVIDES:${PN} += "ghc-call-stack-devel ghc-call-stack-devel(aarch-64) ghc-devel(call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk)"
RDEPENDS:${PN} += "/bin/sh ghc-call-stack ghc-compiler ghc-devel(base-4.17.1.0)"

inherit rpm
