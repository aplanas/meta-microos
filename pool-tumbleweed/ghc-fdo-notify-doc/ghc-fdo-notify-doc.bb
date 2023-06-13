SUMMARY = "Haskell fdo-notify library documentation"
DESCRIPTION = "This package provides the Haskell fdo-notify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-doc-0.3.1-4.3.noarch.rpm"
RPM_HASH = "8623f6e40bd054ea8756b9967b652ce9947494e3b0d50bb8d882c9f31762aafff9751f68bade6732cf491fbf23f5841c6a895dce318e75f71dda700545386835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fdo-notify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
