SUMMARY = "Haskell memory library documentation"
DESCRIPTION = "This package provides the Haskell memory library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-doc-0.18.0-2.7.noarch.rpm"
RPM_HASH = "31fc22b53398522cb7e014399c13e10b99c9bc6e8e687437cbb325ef5a8bcb0a642176bc78f5d53b009001b3a022580a6f7abcd6d8d24e2fb91fe742f23dc19d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-memory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
