SUMMARY = "Haskell array library documentation"
DESCRIPTION = "This package provides the Haskell array library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-doc-0.5.4.0-1.1.noarch.rpm"
RPM_HASH = "6a8642ec33a1547317d544d22fc3ee1966c9d90df3743fd3f6d7da940923359618528b10a227b4be2042700a1d3967d25bbee8b74451ef0c9d64110518536630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-array-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
