SUMMARY = "Haskell ansi-terminal library documentation"
DESCRIPTION = "This package provides the Haskell ansi-terminal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-doc-0.11.5-1.3.noarch.rpm"
RPM_HASH = "2a126a1db29581344fa77346ea8d2c4a08c42a4f2eac1bac80781adbd02f81b2aa621f4a1ab284ea912f416f8daf2851969da87d4a7c8aa592da38b20ef78f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-terminal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
