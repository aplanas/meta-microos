SUMMARY = "Shared directories for Haskell documentation"
DESCRIPTION = "This package provides some common directories used for \
Haskell libraries documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-filesystem-9.4.5-3.2.noarch.rpm"
RPM_HASH = "caeb2deb6de4a23b3bd7f27e481087d9ab8fbdfdd43ef593ae1eaa144c12483e8a76b61c1780fb7cbce9f6c49f19469dc107719991358c1dc8034595a781f679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-filesystem"

RDEPENDS:${PN} += ""

inherit rpm
