SUMMARY = "Haskell hashtables library documentation"
DESCRIPTION = "This package provides the Haskell hashtables library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-doc-1.3.1-1.9.noarch.rpm"
RPM_HASH = "fb4aaee21284d530d1d0791c2f90b9b3448728008be4985b844e17556dfa2f9e62cea53b8ca6531ccbc5d9f926ffbd48069bc0e502111d1202bb8cfd669a186f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashtables-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
