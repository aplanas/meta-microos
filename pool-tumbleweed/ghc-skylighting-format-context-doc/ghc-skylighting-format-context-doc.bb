SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.5.noarch.rpm"
RPM_HASH = "0af62cd1d4ceac760bd51e87c7663d941bb7acfa28aaa84e66efb3b537954e3dadc7b756083ebb930d551c52fc350f5a0b9ed0ebb2992354408a11f5f2522a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
