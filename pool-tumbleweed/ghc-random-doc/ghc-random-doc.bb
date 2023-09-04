SUMMARY = "Haskell random library documentation"
DESCRIPTION = "This package provides the Haskell random library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-doc-1.2.1.1-2.3.noarch.rpm"
RPM_HASH = "93619179bdb9388a80741a883069a9d2a14640e5597c76933a5e12aa83ca94ddb3d6507d829a48acd571d976cebd45ea27c529756ac26138772c1903b53b36e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
