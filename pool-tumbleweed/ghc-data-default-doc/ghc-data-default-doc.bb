SUMMARY = "Haskell data-default library documentation"
DESCRIPTION = "This package provides the Haskell data-default library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-doc-0.7.1.1-10.3.noarch.rpm"
RPM_HASH = "a197fffb7984d3cef725d4bddb75ceb5e3c5e08c8cd5b6f4f377c672a8061b3f8b68074471e75e367158a5b3b31f159a9a94a4856ab572870dad85aa9a98a38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
