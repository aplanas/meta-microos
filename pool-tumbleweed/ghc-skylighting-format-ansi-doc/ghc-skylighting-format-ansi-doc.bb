SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.6.noarch.rpm"
RPM_HASH = "12589ecbee1ba7eb4392767f5546afd58c67b7cbc97a54b7f6964aefab41a401eff9668014cc9f70d24ac706ed19a13cbfbe91af99fed6a0fa9df3eb069fdaa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
