SUMMARY = "Haskell servant-server library documentation"
DESCRIPTION = "This package provides the Haskell servant-server library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-doc-0.19.2-2.8.noarch.rpm"
RPM_HASH = "2f860ae22778e55b1fcd97c37c6ff3ac954d17b8267b606a66e70805fef05d399ef742690155b92edbeb35a5032609cba682fc7c65a28fb2ca65acd65b1989ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
