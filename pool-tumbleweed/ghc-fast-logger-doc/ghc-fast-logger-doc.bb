SUMMARY = "Haskell fast-logger library documentation"
DESCRIPTION = "This package provides the Haskell fast-logger library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-doc-3.1.2-1.7.noarch.rpm"
RPM_HASH = "1e86e78380382d3200951a8b55dd41e59df3bef06ff6f8174668f12de4c2074db5e2de4e23c6c6dbd743849b9c3a6011617aa4bf920796dd8aba29c420d9ae8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fast-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
