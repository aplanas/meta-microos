SUMMARY = "Haskell edit-distance library documentation"
DESCRIPTION = "This package provides the Haskell edit-distance library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-doc-0.2.2.1-13.6.noarch.rpm"
RPM_HASH = "412b8bf6194d5d9c57e0967a6ab42b9a5565b89c3a80b079982d16e3bff799673330a693d1ccacdb6de51e15ba0f9675239d4d9d42944effa5a248ec0f0da338"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-edit-distance-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
