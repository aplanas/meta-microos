SUMMARY = "Haskell skylighting-format-latex library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-doc-0.1-2.4.noarch.rpm"
RPM_HASH = "5c73f3bca77cc09d9064673c9410452646413ce179099d2807876f801f35d68663606ccb7eb20b19d51ec0bf392415868feea40a952c680a6f71dfc8703208a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-latex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
