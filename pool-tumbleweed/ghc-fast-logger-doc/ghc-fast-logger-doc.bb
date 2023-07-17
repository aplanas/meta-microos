SUMMARY = "Haskell fast-logger library documentation"
DESCRIPTION = "This package provides the Haskell fast-logger library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-doc-3.1.2-1.10.noarch.rpm"
RPM_HASH = "8e297c42ba3b51ad8fecd875aa47dcefa9eb57c0354d296e3e1513b636b7fade9071aa6830d1e681b3beb34c92f18aabc9d678f6a2204230119a5c6c2994a107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fast-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
