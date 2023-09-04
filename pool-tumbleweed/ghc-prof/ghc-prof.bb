SUMMARY = "GHC profiling libraries meta package"
DESCRIPTION = "Installing this package causes ghc-*-prof packages corresponding to \
ghc-*-devel packages to be automatically installed too."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-prof-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "a88e273011b3c79ecd11b496f3c181a58116093c0fd209acca894b6f1be7e5db869d71e40473109188d2ebb264e8846866f10deb4b85ad2155cd04cd2c3fb9c5"

RPROVIDES:${PN} += "ghc-prof"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
