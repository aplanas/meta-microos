SUMMARY = "Haskell hslua-module-doclayout library documentation"
DESCRIPTION = "This package provides the Haskell hslua-module-doclayout library documentation."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-doclayout-doc-1.1.0-1.7.noarch.rpm"
RPM_HASH = "ae690e57661551e9261ffd203541db20f5257dc99edb4e9807bbe61a5506dcefa7c36b66f490a5e0dba61109056aed91f483daa0b3854ec81fe0e9220b5c7577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-module-doclayout-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
