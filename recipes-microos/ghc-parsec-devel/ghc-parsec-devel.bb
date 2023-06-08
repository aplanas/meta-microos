SUMMARY = "Haskell parsec library development files"
DESCRIPTION = "This package provides the Haskell parsec library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-devel-3.1.16.1-1.1.aarch64.rpm"
RPM_HASH = "17198a8f78bd6348e2a75840a67557b26a410e81d786c0bef66a84c545961816b586cad28f34f20d94424444165f4c4923788635c89279367f295f26d3602db5"

RPROVIDES:${PN} += "ghc-devel(parsec-3.1.16.1) ghc-parsec-devel ghc-parsec-devel(aarch-64) ghc-parsec-static ghc-parsec-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(mtl-2.2.2) ghc-devel(text-2.0.2) ghc-parsec(aarch-64)"

inherit rpm
