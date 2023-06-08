SUMMARY = "Haskell hpc library development files"
DESCRIPTION = "This package provides the Haskell hpc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-devel-0.6.1.0-1.1.aarch64.rpm"
RPM_HASH = "b53371f0b739f638c91e28a1db0d1b69c93b26b5073f528912363759fa524de2f999100c3820bfdd224a9a4123255800bcc241b3d082b02aec32f94ce18c33c9"

RPROVIDES:${PN} += "ghc-devel(hpc-0.6.1.0) ghc-hpc-devel ghc-hpc-devel(aarch-64) ghc-hpc-static ghc-hpc-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(time-1.12.2) ghc-hpc(aarch-64)"

inherit rpm
