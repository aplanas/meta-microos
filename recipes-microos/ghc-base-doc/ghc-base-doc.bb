SUMMARY = "Haskell base library documentation"
DESCRIPTION = "This package provides the Haskell base library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-doc-4.17.1.0-3.1.noarch.rpm"
RPM_HASH = "590b5a7f914c4222df5e1da9349f2924a152f5aea23969091ed3db5415adf1269437609e9b145ced3b499d5ca2bae3311da32ad40d49b3f5ba1fe59f0e00332f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
