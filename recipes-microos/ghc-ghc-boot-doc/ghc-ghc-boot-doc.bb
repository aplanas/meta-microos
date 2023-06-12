SUMMARY = "Haskell ghc-boot library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-doc-9.4.5-3.1.noarch.rpm"
RPM_HASH = "2ebf697d493e3c5b094a348ca6d51d3c479c0e3d99cbd85919413e3b2584e3c233a4f21c07bb350ca39b6cf8b05eafdcfe266997187bb9511ff0b02d2fb2a6f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
