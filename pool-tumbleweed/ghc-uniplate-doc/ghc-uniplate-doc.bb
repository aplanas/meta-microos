SUMMARY = "Haskell uniplate library documentation"
DESCRIPTION = "This package provides the Haskell uniplate library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-doc-1.6.13-4.10.noarch.rpm"
RPM_HASH = "c67979d2b98386fc69bfcd9a42d5ae1ba7b8fb68246ec3bea96fd0ae9e3759aa2a14409230b12e48ddc3aa61826a6bdc833f43d21b7344d1200675f04f7aedaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uniplate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
