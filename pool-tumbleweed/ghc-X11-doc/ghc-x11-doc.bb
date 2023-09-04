SUMMARY = "Haskell X11 library documentation"
DESCRIPTION = "This package provides the Haskell X11 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-doc-1.10.3-2.8.noarch.rpm"
RPM_HASH = "33d4d4c1612e3c5f867348bb6109b89ff6f31b59432fe1c2f53b21cfbaac403ae58eba20ea2fb3dada990458270ce81482600e92518ad4bcfbd3f01d57350c31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
