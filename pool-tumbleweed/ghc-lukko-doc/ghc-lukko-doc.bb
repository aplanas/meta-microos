SUMMARY = "Haskell lukko library documentation"
DESCRIPTION = "This package provides the Haskell lukko library documentation."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-doc-0.1.1.3-5.3.noarch.rpm"
RPM_HASH = "1d0e910d762ca138547f63b9ef2a58d67113bde37eefc5fd12480a6b7e7cde352bdd76982deb93abbf731dcd87928b3d8f4e801171cf2311e584534f2e176788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lukko-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
