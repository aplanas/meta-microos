SUMMARY = "Haskell stm library development files"
DESCRIPTION = "This package provides the Haskell stm library development files."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-devel-2.5.1.0-1.1.aarch64.rpm"
RPM_HASH = "dc679eb51b321382adcfedcf0d526f5eaa097e1656e17b29b97334b6f698210aeecb4b4685cbd886e13e4bde6b65d6c0c36453fe06d8d456c9a7c82a40412f83"

RPROVIDES:${PN} += "ghc-devel(stm-2.5.1.0) ghc-stm-devel ghc-stm-devel(aarch-64) ghc-stm-static ghc-stm-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-stm(aarch-64)"

inherit rpm
