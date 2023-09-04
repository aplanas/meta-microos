SUMMARY = "Haskell cairo library documentation"
DESCRIPTION = "This package provides the Haskell cairo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-doc-0.13.10.0-1.6.noarch.rpm"
RPM_HASH = "eeeb250a5419f7cd53477349a9a3548c342fa1adb1f8f85ba0ec387345ea6212d4cae5419082bbeae35fef1079c78815fcdbc6a14e222a31a1ba0cbfab6f3d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cairo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
