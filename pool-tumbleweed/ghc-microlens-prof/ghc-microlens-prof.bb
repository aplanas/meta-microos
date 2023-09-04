SUMMARY = "Haskell microlens profiling library"
DESCRIPTION = "This package provides the Haskell microlens profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-prof-0.4.13.1-2.3.aarch64.rpm"
RPM_HASH = "dbb68940deca1774a9e4e1a095e893f07c1eea463224da89401db6d4fa53a4bb98962695eba44a1ebbf1904cd81bebc15e2a1ac3231edf6ba8743abd08bd7bb4"

RPROVIDES:${PN} += "ghc-microlens-prof \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3"

RDEPENDS:${PN} += "ghc-microlens-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
