SUMMARY = "Haskell word-wrap library documentation"
DESCRIPTION = "This package provides the Haskell word-wrap library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-doc-0.5-2.3.noarch.rpm"
RPM_HASH = "26689ffe60b11b94a623aa2a35117d6308ffcf0ed399a09fb36869bf1e4f6576c9f7ddd1558c375ac119748a8c405c0a129d326df468f8cc1ab831e2d6621eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word-wrap-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
