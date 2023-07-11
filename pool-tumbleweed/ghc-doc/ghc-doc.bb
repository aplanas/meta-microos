SUMMARY = "Haskell library documentation meta package"
DESCRIPTION = "Installing this package causes ghc-*-doc packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-doc-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "639e4a3b1cb81eab4db38a56b24f48690fbea1b3001e5c131a0721dec7486b96354cc5fdfc3fc38bac48be0bb079efaf0856b085f325d19eb6bc6ee5593f79c0"

RPROVIDES:${PN} += "ghc-doc"

RDEPENDS:${PN} += ""

inherit rpm
