SUMMARY = "Haskell brick library documentation"
DESCRIPTION = "This package provides the Haskell brick library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-doc-1.6-2.4.noarch.rpm"
RPM_HASH = "06735204b9c865e3c50bf12a05c2aca95d6ecc7c72208ddd8142c4e6fc1b8e1c258c2172a55bfab53160a2e76044ba451b58e12bd7e0103045c9cc9c167581d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-brick-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
