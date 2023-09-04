SUMMARY = "Haskell transformers-base library documentation"
DESCRIPTION = "This package provides the Haskell transformers-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-doc-0.4.6-2.3.noarch.rpm"
RPM_HASH = "b52c3267d6239c4619f72b4073f29055888b3772db5e9e502046f2e7e88f4d5f95e186ff1c0ecd5628bfc3e3549243bfc80841e9a4dce9c15dad9c183f379aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
