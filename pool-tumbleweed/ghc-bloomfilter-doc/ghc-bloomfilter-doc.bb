SUMMARY = "Haskell bloomfilter library documentation"
DESCRIPTION = "This package provides the Haskell bloomfilter library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-doc-2.0.1.0-6.3.noarch.rpm"
RPM_HASH = "e652468e70f644303a8bb70d9721cc39ff73b722f4a9906533146c328b59ac290b7a5d7c32522cffe5d50bb94dd256b4d2b0d8c7abda86a898a7d821fe20f2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bloomfilter-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
