SUMMARY = "Haskell primes library documentation"
DESCRIPTION = "This package provides the Haskell primes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-primes-doc-0.2.1.0-1.2.noarch.rpm"
RPM_HASH = "c4f5d398e79c3c83c8c1f7df84529d141bfec98afd02c6c9307546522ac7753e0b0a0bbda72da1ea3047993fb83c25a12d80130f2b6704969c3d3490fbfa4da2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-primes-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
