SUMMARY = "Haskell terminfo profiling library"
DESCRIPTION = "This package provides the Haskell terminfo profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.5"

RPM_NAME = "ghc-terminfo-prof-0.4.1.5-1.1.aarch64.rpm"
RPM_HASH = "41a31bd12bc8059a90a48aa8eeab5b606ef46b2b68efff5df32621178ccd4700c58dfcf64aa3eeacea4e3bb98f6e97fd36bd1a88d0727caf4402073d9ffde340"

RPROVIDES:${PN} += "ghc-prof(terminfo-0.4.1.5) ghc-terminfo-prof ghc-terminfo-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-terminfo-devel(aarch-64)"

inherit rpm
