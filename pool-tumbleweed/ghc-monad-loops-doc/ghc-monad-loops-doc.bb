SUMMARY = "Haskell monad-loops library documentation"
DESCRIPTION = "This package provides the Haskell monad-loops library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-doc-0.4.3-11.3.noarch.rpm"
RPM_HASH = "1d77fa7e4cb2bf2a1f4bfa0186ef2157a40356754da5a675e5ff458859b96ec8d8757868c4b6f0b07c1025815e60e9d8b04781040e1f452f9b322346af9fde5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-loops-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
