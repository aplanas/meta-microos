SUMMARY = "Haskell filepattern library documentation"
DESCRIPTION = "This package provides the Haskell filepattern library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-doc-0.1.3-2.8.noarch.rpm"
RPM_HASH = "5a16f8ba5294c17391ec8d0dd2528dfe9ffe164bf7dc203738348e5a810a0b6da7e46d0dba8a7030402870d799732c3761242e561ed92482c75cfd181bcbacd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filepattern-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
