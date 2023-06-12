SUMMARY = "Haskell refact library documentation"
DESCRIPTION = "This package provides the Haskell refact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-doc-0.3.0.2-4.2.noarch.rpm"
RPM_HASH = "850d462452ada7f7643b765244dfce81c757ddc8641214457e8432a4cfe2ea089ac45a0a90223de5269a75d7f998f0aea1e3c4fca322e93f984276508251ad01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-refact-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
