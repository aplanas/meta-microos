SUMMARY = "Haskell invariant library documentation"
DESCRIPTION = "This package provides the Haskell invariant library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-invariant-doc-0.6.1-1.3.noarch.rpm"
RPM_HASH = "2cb0dce95765ac9b1f04e324d6395226c5903afaf3cfd16f01f229de7826cc8ada98daacff737e8ecd53100c6c048a921bc2abe6baf3a93cf52ec0757aeb35b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-invariant-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
