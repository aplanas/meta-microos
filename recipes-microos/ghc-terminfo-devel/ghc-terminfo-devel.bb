SUMMARY = "Haskell terminfo library development files"
DESCRIPTION = "This package provides the Haskell terminfo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-devel-0.4.1.5-1.1.aarch64.rpm"
RPM_HASH = "d6586f78b1345636361844116cf98d860be45427b94e855a08ef3153543c2c7807eed5d467ef24050e0d1d3b5de385c6662d06878c0ccd29975fefa6139703df"

RPROVIDES:${PN} += "ghc-devel(terminfo-0.4.1.5) ghc-terminfo-devel ghc-terminfo-devel(aarch-64) ghc-terminfo-static ghc-terminfo-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-terminfo(aarch-64) ncurses-devel"

inherit rpm
