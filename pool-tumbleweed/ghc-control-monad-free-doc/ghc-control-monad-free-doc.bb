SUMMARY = "Haskell control-monad-free library documentation"
DESCRIPTION = "This package provides the Haskell control-monad-free library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.6.2"

RPM_NAME = "ghc-control-monad-free-doc-0.6.2-4.8.noarch.rpm"
RPM_HASH = "198b1589f53dc820a5ec33bfd87fd89d4c93ea3f602136f76b5914707ed3f7f0dfb9718bd77f59b9e53658917a503904fe3dee7f6c51a72b425313db5e498f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-control-monad-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
