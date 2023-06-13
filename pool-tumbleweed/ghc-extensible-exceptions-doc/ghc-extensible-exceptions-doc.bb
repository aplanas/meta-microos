SUMMARY = "Haskell extensible-exceptions library documentation"
DESCRIPTION = "This package provides the Haskell extensible-exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-doc-0.1.1.4-7.2.noarch.rpm"
RPM_HASH = "13ff5862784cb008f35137896d5e44dc636f28eedece6619c2227bfe735483b1e89fc401a3b42ce0579ef1ceb548864179bcbe175101b74c9aa186eb72b43347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-extensible-exceptions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
