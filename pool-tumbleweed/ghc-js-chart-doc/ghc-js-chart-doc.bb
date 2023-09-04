SUMMARY = "Haskell js-chart library documentation"
DESCRIPTION = "This package provides the Haskell js-chart library documentation."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-doc-2.9.4.1-2.3.noarch.rpm"
RPM_HASH = "720ef341263303d8e89f581a54b69eafb2812cf05b153bb96c10e1cb5037fcbb12818ebac9d3c9f024071a016b263142755eb6728f4a7f7b17db6f735af47cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-js-chart-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
