SUMMARY = "Haskell hadolint library documentation"
DESCRIPTION = "This package provides the Haskell hadolint library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-doc-2.12.0-1.15.noarch.rpm"
RPM_HASH = "2a86e0efc46ad6dec90e01cd488d1d22387e09c2453a189c8c40c5036c95932e0701455f27295a80a162321b1caaa71b266500aabb293907da062bf822c92134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hadolint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
