SUMMARY = "Haskell cpphs library documentation"
DESCRIPTION = "This package provides the Haskell cpphs library documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.9.1"

RPM_NAME = "ghc-cpphs-doc-1.20.9.1-5.6.noarch.rpm"
RPM_HASH = "907db02713ba6b9bafa90745650518c5c759f1b9d0827fa50606de1e99c261d9ae6edcaf45a050b48b0edaf4de6ccc873c87156745af663a07d39d6b1cdce2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cpphs-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
