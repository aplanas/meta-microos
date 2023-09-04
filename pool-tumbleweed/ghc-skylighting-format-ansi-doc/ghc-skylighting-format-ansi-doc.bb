SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.10.noarch.rpm"
RPM_HASH = "bd7055e3a8ecd919f3d228ba004086df62c63e8af6ca54cb9f4fc66b01df6f57eb79fcfac68c28f1ff93b8ad2a5e08f5748009a42056735fbee3b5144becb9bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
