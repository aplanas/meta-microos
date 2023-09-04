SUMMARY = "Haskell unix-time library documentation"
DESCRIPTION = "This package provides the Haskell unix-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-doc-0.4.10-1.3.noarch.rpm"
RPM_HASH = "633597e789e2820d761ec2971fcca40d8a8d7513a9d2c4ab4597314af559970aacf1bf80a0ac0b1e237b932a5058a687fc1c714bea86293fc4d89caf6a3c9070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
