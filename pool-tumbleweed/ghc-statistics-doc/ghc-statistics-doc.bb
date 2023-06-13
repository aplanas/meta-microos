SUMMARY = "Haskell statistics library documentation"
DESCRIPTION = "This package provides the Haskell statistics library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.16.2.0"

RPM_NAME = "ghc-statistics-doc-0.16.2.0-1.3.noarch.rpm"
RPM_HASH = "b47565d8e59e7d3a57458c663b24f3ad9fd1e4dc4a3142926ef37cb79ed060a0266f96c5a1ea2e509751e3285e9e8354eb5ad69f9013cb5c8e3724479919016e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-statistics-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
