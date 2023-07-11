SUMMARY = "Haskell unix-compat library documentation"
DESCRIPTION = "This package provides the Haskell unix-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-doc-0.6-3.6.noarch.rpm"
RPM_HASH = "2d0e57694130ed9926e09973388ba5560da7d302478a7caacd84b9961621620960026b9efb8302b707d38816d7374dac124fba836f2e68edb497753b7325dd07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
