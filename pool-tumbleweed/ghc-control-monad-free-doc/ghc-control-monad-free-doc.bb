SUMMARY = "Haskell control-monad-free library documentation"
DESCRIPTION = "This package provides the Haskell control-monad-free library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-doc-0.6.2-4.3.noarch.rpm"
RPM_HASH = "2b58baabc45f17ff0494f2988249e19873d589c6298e92295a08620d90d0128bc1ead637ab11e5770103dec3a048d35a8d1d93de2dedfa2131748fe6058aedcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-control-monad-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
