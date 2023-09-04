SUMMARY = "Haskell Glob library documentation"
DESCRIPTION = "This package provides the Haskell Glob library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-doc-0.10.2-3.8.noarch.rpm"
RPM_HASH = "34970cc89cc283f98950cc6421853245d731c82a3301a17efffb2ae382b97bfee55e1168a6d39d8cd60c84c22a1d3b9ffeb1201864d4a3bd2020aa4fff6ed898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Glob-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
