SUMMARY = "Haskell ghc-lib-parser-ex library documentation"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-doc-9.4.0.0-1.12.noarch.rpm"
RPM_HASH = "fe58956a3f39f7bcc0de1dc7c287af6853e5d710f3d2fca1df553cc655c5cc4b8f981453fb754ed25d3f2aab32ae1a79472b3872d6cdb680faf33eaca5bc2925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-ex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
