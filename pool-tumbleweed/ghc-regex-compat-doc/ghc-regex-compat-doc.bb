SUMMARY = "Haskell regex-compat library documentation"
DESCRIPTION = "This package provides the Haskell regex-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-doc-0.95.2.1-4.3.noarch.rpm"
RPM_HASH = "18c36336138e849e494071414a491ab61927b2ff617fa442e3b47accbf786d426599aa9365efe7d275f6dcc24766648e8c4c5877c0733b0b7fa59407d4932f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
