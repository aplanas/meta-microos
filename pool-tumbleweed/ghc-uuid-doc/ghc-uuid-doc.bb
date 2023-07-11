SUMMARY = "Haskell uuid library documentation"
DESCRIPTION = "This package provides the Haskell uuid library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.15"

RPM_NAME = "ghc-uuid-doc-1.3.15-4.6.noarch.rpm"
RPM_HASH = "fb89a3ff7c84168576f891d3b03789af3db68829a7b2637f83db4de652ddc95bb11f4bf6fbe99f41bfa699874ae77e721e710ee3210b38254a2cb9617fce26f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
