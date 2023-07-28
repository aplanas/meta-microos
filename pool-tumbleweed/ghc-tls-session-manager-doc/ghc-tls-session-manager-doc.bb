SUMMARY = "Haskell tls-session-manager library documentation"
DESCRIPTION = "This package provides the Haskell tls-session-manager library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-doc-0.0.4-4.4.noarch.rpm"
RPM_HASH = "d6ac2184c396348b4322bb469849ddb3060dbc2b4fbe2249f0e57e858a3613f179daf70d3e58057125c66c4a912f0e6eb7bbbf30affd031797945f752fe837bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tls-session-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
