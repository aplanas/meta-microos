SUMMARY = "Haskell microlens profiling library"
DESCRIPTION = "This package provides the Haskell microlens profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-prof-0.4.13.1-2.2.aarch64.rpm"
RPM_HASH = "118226bb4bddb97e390dcb2020949e43e0c1bf1262afed223b1232209256e8fcef9516ee46a46205ab3bb3a01b30ab7ca33b4bb17774471a6eb789d03a9e35d9"

RPROVIDES:${PN} += "ghc-microlens-prof \
ghc-microlens-prof(aarch-64) \
ghc-prof(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1)"

RDEPENDS:${PN} += "ghc-microlens-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
