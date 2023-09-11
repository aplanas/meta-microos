SUMMARY = "Haskell brick library documentation"
DESCRIPTION = "This package provides the Haskell brick library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-doc-1.6-2.12.noarch.rpm"
RPM_HASH = "476970feb59eb7087ea09ecf04d10b6d3e0f659498ae8602e48d43dc063b6497cc1a16f38dc1fe6f4178bafd7bf0456eddcf77710921cf1e3feb754a6fba213b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-brick-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
