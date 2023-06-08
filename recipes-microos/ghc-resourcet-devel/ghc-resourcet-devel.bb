SUMMARY = "Haskell resourcet library development files"
DESCRIPTION = "This package provides the Haskell resourcet library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-devel-1.2.6-2.3.aarch64.rpm"
RPM_HASH = "a37c92540224f92db69a843f7a64fccb19fbdf2172b3a0caa89f110f87b8e15294c8e4c5e74333670afb9b433d2944f5faf7cd9c5a08156311f07691edf464fe"

RPROVIDES:${PN} += "ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-resourcet-devel ghc-resourcet-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(exceptions-0.10.5) ghc-devel(mtl-2.2.2) ghc-devel(primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq) ghc-devel(transformers-0.5.6.2) ghc-devel(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) ghc-resourcet"

inherit rpm
