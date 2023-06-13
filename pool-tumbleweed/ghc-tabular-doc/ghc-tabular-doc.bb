SUMMARY = "Haskell tabular library documentation"
DESCRIPTION = "This package provides the Haskell tabular library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-doc-0.2.2.8-4.3.noarch.rpm"
RPM_HASH = "9ed0f705fdf08da91f7e2d9811caf7e8ff6d73bf1ab7aebb8627be4a5f5a59959151c3f14e58c7ca8a2095c4da26b67b211680fa190b307f9d2621cf823f1e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tabular-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
