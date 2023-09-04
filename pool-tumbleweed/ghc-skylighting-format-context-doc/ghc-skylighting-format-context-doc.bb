SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.10.noarch.rpm"
RPM_HASH = "23701090b086f189b1f377ffd222ed935b55cd9f841dc6d74e98665cc304d2dc34f2d536e5d03ad939ac8c79f024160105e4fa5e0a294b5a2c82fb6c8fbd1a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
