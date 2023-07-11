SUMMARY = "Haskell ansi-wl-pprint library documentation"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-doc-0.6.9-11.1.noarch.rpm"
RPM_HASH = "1d81f4c63b29202ba66961fb7be0c5bbe583cf46aedaf21c1f5435bafb8c7d22de3c3ee3552fa4047da9d6302f47cb3413abfc8eb617676d3708de73151fbb7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
