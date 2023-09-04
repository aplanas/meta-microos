SUMMARY = "Haskell streaming-commons library documentation"
DESCRIPTION = "This package provides the Haskell streaming-commons library documentation."
LICENSE = "MIT"

PV = "0.2.2.6"

RPM_NAME = "ghc-streaming-commons-doc-0.2.2.6-1.10.noarch.rpm"
RPM_HASH = "84512d733b2ea2cfb51d993cbaa0411e73bc82796b0fd662e62a75d158a83e7d2eab16a54f99962e2ee4d690356ec8919ccd28e5b0d290a50cdb4454529789f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-streaming-commons-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
