SUMMARY = "Haskell DAV library documentation"
DESCRIPTION = "This package provides the Haskell DAV library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-doc-1.3.4-4.6.noarch.rpm"
RPM_HASH = "aff3cf583ff793a0b90b0e1338a7c659640a9a9ad08e001a8be9b01e2d75fe2b53b53227dafa1a553fb15880d277eb1104027e5b23f4aa8d8789820473d4702f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-DAV-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
