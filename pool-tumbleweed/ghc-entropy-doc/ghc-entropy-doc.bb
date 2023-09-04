SUMMARY = "Haskell entropy library documentation"
DESCRIPTION = "This package provides the Haskell entropy library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.10"

RPM_NAME = "ghc-entropy-doc-0.4.1.10-3.4.noarch.rpm"
RPM_HASH = "735c1c1aa6330421a05f2557a6df6a5a38c72308937ac01bc2981bbf68d43e127e5476aa5e851986cb6892c8b6f6dafc1268d8cef6d8e1f14531820535408a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-entropy-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
