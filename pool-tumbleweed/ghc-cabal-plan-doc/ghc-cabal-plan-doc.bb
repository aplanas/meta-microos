SUMMARY = "Haskell cabal-plan library documentation"
DESCRIPTION = "This package provides the Haskell cabal-plan library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-doc-0.7.3.0-2.4.noarch.rpm"
RPM_HASH = "b528d28407d2c6118b0b9252ae7ce074ddcfbdf8353dde06c2a449826d3bb43dde3b29ef720814a89ae7a77524f7088f84ae8339057cdd16e851fbe765ce5940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-plan-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
