SUMMARY = "Haskell xml-hamlet library documentation"
DESCRIPTION = "This package provides the Haskell xml-hamlet library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-doc-0.5.0.2-2.9.noarch.rpm"
RPM_HASH = "6b554fd355d061e9bf681ee17c399cf7018edc60ff9f8814a9d9d407c226e141ebc237e8ea6419bc5ed4ecf7c35842152bac8d5acf3001089b2f8754daa8aec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xml-hamlet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
