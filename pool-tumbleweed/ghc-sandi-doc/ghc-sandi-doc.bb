SUMMARY = "Haskell sandi library documentation"
DESCRIPTION = "This package provides the Haskell sandi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-doc-0.5-5.7.noarch.rpm"
RPM_HASH = "9d758bd9b6e4755bd6f003cfbe1989ed4cb0d26a44eb5ecd76c56b77588884671920696dab3b5201782ae01fb3c89624367554bf9739fe17da4a1cb786e5df8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-sandi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
