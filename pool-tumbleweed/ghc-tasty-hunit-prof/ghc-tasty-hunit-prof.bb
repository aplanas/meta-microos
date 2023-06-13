SUMMARY = "Haskell tasty-hunit profiling library"
DESCRIPTION = "This package provides the Haskell tasty-hunit profiling library."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-prof-0.10.0.3-2.2.aarch64.rpm"
RPM_HASH = "1f0a2153d5975b779c864b5e59f7ea2779b71537aaac096fc92a5cc15196736f90f3d9b676fd9bb55a32792d2100daf476e47dceb419fd3a219fe599d308fb59"

RPROVIDES:${PN} += "ghc-prof(tasty-hunit-0.10.0.3-CV9N1Lkn3CAEveU82YsKyL) \
ghc-tasty-hunit-prof \
ghc-tasty-hunit-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk) \
ghc-prof(tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz) \
ghc-tasty-hunit-devel"

inherit rpm
