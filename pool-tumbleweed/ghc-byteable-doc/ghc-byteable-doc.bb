SUMMARY = "Haskell byteable library documentation"
DESCRIPTION = "This package provides the Haskell byteable library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-doc-0.1.1-12.3.noarch.rpm"
RPM_HASH = "cf886e214d52fe25c9b8f81b73a65809a8dba0fbc6105547942c430ed3ecbedce0db8012f16a895064b05d3186ab304db2d950e5a05fabb9c6473580f9e01b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-byteable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
