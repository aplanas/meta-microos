SUMMARY = "Haskell dec library documentation"
DESCRIPTION = "This package provides the Haskell dec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-doc-0.0.5-2.2.noarch.rpm"
RPM_HASH = "6502dff2d2ce368851077dd97b57c3fd119823570525418c092afddea7371218fb551526657e681a992c4d2cb1f40afe7ff04613ca0dd1c89cbcfa49cf1ab4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dec-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
