SUMMARY = "Haskell extra library documentation"
DESCRIPTION = "This package provides the Haskell extra library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-doc-1.7.14-1.3.noarch.rpm"
RPM_HASH = "e352ca36d5756a65d154a0736e5f43d5867ed6ed978b20495fc2adb2af7a06a4306ca7786e892857aca2081d2e844e0c3bd341ddfce4a30e3493d171b1999120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
