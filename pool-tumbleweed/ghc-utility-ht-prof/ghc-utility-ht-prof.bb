SUMMARY = "Haskell utility-ht profiling library"
DESCRIPTION = "This package provides the Haskell utility-ht profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-prof-0.0.17-1.3.aarch64.rpm"
RPM_HASH = "d556416d106d578a9f5baa316f402b595eca2bc60cd6c1b07170bf742ea9a05a7659f502defa92f19466b07b1015825e26e295d347565ea2fed30e237d877b1d"

RPROVIDES:${PN} += "ghc-prof-utility-ht-0.0.17-3onflAp0qnlITa4Vy6FXwy \
ghc-utility-ht-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-utility-ht-devel"

inherit rpm
