SUMMARY = "Haskell QuickCheck library documentation"
DESCRIPTION = "This package provides the Haskell QuickCheck library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.14.3"

RPM_NAME = "ghc-QuickCheck-doc-2.14.3-1.5.noarch.rpm"
RPM_HASH = "43ec867aa4995866fd9224de35f513ba5aacbbb71f4b510bd3b38aa4b8c97eb49669e143406e5f790c8976e623a5a54530c279a9d3b561e5b2b2443f7f6afe0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-QuickCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
