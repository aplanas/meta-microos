SUMMARY = "Haskell extra library documentation"
DESCRIPTION = "This package provides the Haskell extra library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.13"

RPM_NAME = "ghc-extra-doc-1.7.13-1.2.noarch.rpm"
RPM_HASH = "b8e93aae2c3be99e06baf68495a3d3a35c720368f4af267faaec26a9cc39a253949a37253e9cc6ad41f43f8453ddd18d6f07ef58f4f8e68e3572d2a80f1a2168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extra-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
