SUMMARY = "Haskell monoid-subclasses library documentation"
DESCRIPTION = "This package provides the Haskell monoid-subclasses library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.3"

RPM_NAME = "ghc-monoid-subclasses-doc-1.2.3-1.7.noarch.rpm"
RPM_HASH = "f41a06872f08ca149810f58247f399e5a7c29802ed43013dbd3291a3427c69ea94d579d4ff4b2216277a2f13a1fdf6256a7884013ee4ac4ad0f105ff1eac435d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monoid-subclasses-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
