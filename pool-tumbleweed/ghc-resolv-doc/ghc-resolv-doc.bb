SUMMARY = "Haskell resolv library documentation"
DESCRIPTION = "This package provides the Haskell resolv library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-doc-0.1.2.0-10.6.noarch.rpm"
RPM_HASH = "2781dd435dc480456eacd743e40b9985cfe4c3f8ed46c54c51f1173baa09629d3daace7d8545819c9f4d3fda235e8ba7fb308041828bf274984940f3a82e578f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resolv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
