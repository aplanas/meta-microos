SUMMARY = "Haskell hourglass library documentation"
DESCRIPTION = "This package provides the Haskell hourglass library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-doc-0.2.12-7.3.noarch.rpm"
RPM_HASH = "869f371b8ba999ba8a39460d21c267ddcba59680c5a719df5776351c97c8f97d5b2f3c39b674bd072617ea93255bef4f705db60523defb57acc6ceb2128ae31d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hourglass-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
