SUMMARY = "Haskell directory profiling library"
DESCRIPTION = "This package provides the Haskell directory profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-prof-1.3.7.1-3.2.aarch64.rpm"
RPM_HASH = "f22b62b74bae50b904e111d3356d447d9174d2f24e6e831018ac8392046af7c6e1159e1ac79b840b905790853ec8404afc28782a098f77603c90d309561fd9b7"

RPROVIDES:${PN} += "ghc-directory-prof \
ghc-prof-directory-1.3.7.1"

RDEPENDS:${PN} += "ghc-directory-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm
