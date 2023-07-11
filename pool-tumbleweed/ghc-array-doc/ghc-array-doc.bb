SUMMARY = "Haskell array library documentation"
DESCRIPTION = "This package provides the Haskell array library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-doc-0.5.4.0-3.2.noarch.rpm"
RPM_HASH = "b7992e1a953778163470100b82ea2709da3b746d6564d48573149caea4bffd5494a71ab7ab5f0424ce0c27d8fdf8f53134d915252b85da9c7a134a638c10aeea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-array-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
