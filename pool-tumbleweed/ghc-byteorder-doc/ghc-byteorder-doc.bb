SUMMARY = "Haskell byteorder library documentation"
DESCRIPTION = "This package provides the Haskell byteorder library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-doc-1.0.4-4.2.noarch.rpm"
RPM_HASH = "454d7be08a94b16ced9702f8364b6df806bd8e052b89ebd048526d76f420202072db68dcfefcf01a8f9b4fd1213814d7e149ca89ef344950dc3d3766d63af216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-byteorder-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
