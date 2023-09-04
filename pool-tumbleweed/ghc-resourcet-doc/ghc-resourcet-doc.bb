SUMMARY = "Haskell resourcet library documentation"
DESCRIPTION = "This package provides the Haskell resourcet library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.6"

RPM_NAME = "ghc-resourcet-doc-1.2.6-2.8.noarch.rpm"
RPM_HASH = "56072bd977781299b796b3b8a43dfc36bf8f538f7af0b8dd5534e85b653d98e3b4398fe23c3ba97fba2243daa960b752997b75a2dca77ea6409ef61d5609bcc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resourcet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
