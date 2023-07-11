SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.3"

RPM_NAME = "ghc-skylighting-core-doc-0.13.3-1.2.noarch.rpm"
RPM_HASH = "38e01309680388bb7befead141f5a481d600ccbaef234c5a5b079f6156adaa7b792d71aedc439d703fe0767bd4683a0654bb4e380d70bc8913af40f6dc4504e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
