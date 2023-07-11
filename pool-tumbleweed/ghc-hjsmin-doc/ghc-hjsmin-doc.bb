SUMMARY = "Haskell hjsmin library documentation"
DESCRIPTION = "This package provides the Haskell hjsmin library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-doc-0.2.1-1.5.noarch.rpm"
RPM_HASH = "5cae783d298e521a0666296cbe9acd25fc0899019e141b7d77566abb0285d1731c626b89aa23cda5a46a6d621a5559b98a3254a98468dd13d8b02058866f3709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hjsmin-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
