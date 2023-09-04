SUMMARY = "Haskell unordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell unordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-doc-0.2.19.1-3.9.noarch.rpm"
RPM_HASH = "eccbc44e0b0967310fa922297f4a9941ad13c38710a1e9ad412b2acf80ce2d746a27fe98f4c5940adc363cd06bf96b811c732bdd085822a1d04682f3ff5320b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
