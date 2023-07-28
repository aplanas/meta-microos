SUMMARY = "Haskell extra library documentation"
DESCRIPTION = "This package provides the Haskell extra library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-doc-1.7.14-1.2.noarch.rpm"
RPM_HASH = "7dcff6e6f6ee78eb7405d1e436161f0c0948476e541258a4e54a213ef58055dc2d62bb8317f4a94365c70f012cccc550aa892bd2937627fd3b4d90f9f39bcb4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
