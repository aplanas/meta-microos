SUMMARY = "Haskell cairo library documentation"
DESCRIPTION = "This package provides the Haskell cairo library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.8.2"

RPM_NAME = "ghc-cairo-doc-0.13.8.2-2.3.noarch.rpm"
RPM_HASH = "b345d17317191f114e7098fa05cb2b708ed5dcde6902d62b1fda3431684f00541a9969d936ab2665a21f6655ed8f9fe1260637c1bdf698d8eab08500025b5890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cairo-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
