SUMMARY = "Shared directories for Haskell documentation"
DESCRIPTION = "This package provides some common directories used for \
Haskell libraries documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-filesystem-9.4.5-3.1.noarch.rpm"
RPM_HASH = "3a5a0e4eba20c1a96ea7936664bfc627eec6dd6c636a45230962fc64561b027827e5256bf0c248e5bd901991408387dc483d2bcbf872dc3c29998ec096fc0a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filesystem"

RDEPENDS:${PN} += ""

inherit rpm
