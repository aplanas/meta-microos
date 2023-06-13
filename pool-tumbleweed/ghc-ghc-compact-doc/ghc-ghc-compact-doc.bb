SUMMARY = "Haskell ghc-compact library documentation"
DESCRIPTION = "This package provides the Haskell ghc-compact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-doc-0.1.0.0-3.1.noarch.rpm"
RPM_HASH = "34607815191e967c75a9ea2339a2d58f820678392b27043f0eaaabf5be59331ea1ffc4999a1ebf8a8c6f373220c6f27cc2bf533f90aa5450e6009dbe80988b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-compact-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
