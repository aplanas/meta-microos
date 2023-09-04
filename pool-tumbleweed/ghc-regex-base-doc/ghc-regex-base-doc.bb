SUMMARY = "Haskell regex-base library documentation"
DESCRIPTION = "This package provides the Haskell regex-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-doc-0.94.0.2-4.3.noarch.rpm"
RPM_HASH = "95b7de162802ba8d20cb762e2a641b1527b3a16217784598b0a7eb98680fab3d91feafd868c525b9ee713358d82ad0bd7b79aa7ed151c79dee1f4c96a7adb0b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
