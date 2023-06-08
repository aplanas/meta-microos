SUMMARY = "Haskell hpc library documentation"
DESCRIPTION = "This package provides the Haskell hpc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-doc-0.6.1.0-1.1.noarch.rpm"
RPM_HASH = "f734519def00205551942fa7d65998395c2696e017bd380864e7db0032fa79b1cbe19bc4b30ce17536212c391efb572fe2c79527d8684eb5b75434cece702852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hpc-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
