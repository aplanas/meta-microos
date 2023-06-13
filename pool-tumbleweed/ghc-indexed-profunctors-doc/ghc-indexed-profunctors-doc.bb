SUMMARY = "Haskell indexed-profunctors library documentation"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-indexed-profunctors-doc-0.1.1-2.2.noarch.rpm"
RPM_HASH = "1f086b60c4b900ba9701b37d57b365c5cf35f59bc936d3dc20e7d553adce0ebd77b6dfeeb8c01d39547eb670294ef97e30c8dd267daf780e3cec3ff7d2badc02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-profunctors-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
