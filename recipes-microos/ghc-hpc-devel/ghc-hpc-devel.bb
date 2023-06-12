SUMMARY = "Haskell hpc library development files"
DESCRIPTION = "This package provides the Haskell hpc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-devel-0.6.1.0-3.1.aarch64.rpm"
RPM_HASH = "3a52042f5b66b12250d912648499cfa69f3aba9e6df7ed8708223e396128fb7682791548bc8891db299c4ac0bdec6a57c6ea04aa668a877b5ac2edb188fff5af"

RPROVIDES:${PN} += "ghc-devel(hpc-0.6.1.0) ghc-hpc-devel ghc-hpc-devel(aarch-64) ghc-hpc-static ghc-hpc-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(time-1.12.2) ghc-hpc(aarch-64)"

inherit rpm
