SUMMARY = "Haskell pretty library development files"
DESCRIPTION = "This package provides the Haskell pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-devel-1.1.3.6-1.1.aarch64.rpm"
RPM_HASH = "551f72d5302e22735d95e653ab155f25a5a460e3c608003f77e53a195b8175f9e570e969d01b3e76e732c0ee09db6d9dd7d3e79efd2084cbc0610fc4a0a37b3d"

RPROVIDES:${PN} += "ghc-devel(pretty-1.1.3.6) ghc-pretty-devel ghc-pretty-devel(aarch-64) ghc-pretty-static ghc-pretty-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(ghc-prim-0.9.0) ghc-pretty(aarch-64)"

inherit rpm
