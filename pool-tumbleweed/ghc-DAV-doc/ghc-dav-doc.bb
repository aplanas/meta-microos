SUMMARY = "Haskell DAV library documentation"
DESCRIPTION = "This package provides the Haskell DAV library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.4"

RPM_NAME = "ghc-DAV-doc-1.3.4-4.12.noarch.rpm"
RPM_HASH = "f661d51941dec9b0e06358a610babe6047ec4c55ccc4a67523b3892339f0e10e7a3c388b9db9e9130bc55323c044ae7d9b9f0a2b509cf20fc1587a6604c3c4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-DAV-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
