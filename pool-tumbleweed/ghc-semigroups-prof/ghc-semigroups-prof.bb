SUMMARY = "Haskell semigroups profiling library"
DESCRIPTION = "This package provides the Haskell semigroups profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.20"

RPM_NAME = "ghc-semigroups-prof-0.20-2.2.aarch64.rpm"
RPM_HASH = "88df29abf18239d4a65d49b46e8cc8ec277499f45e8c8795d9a7d0b9933ebc369e803a979742b42a462428d602bca3b4d891ae0a4bb847b92ccbccdfb3094ebd"

RPROVIDES:${PN} += "ghc-prof(semigroups-0.20-KtsaS4jNcGkoC9puVZ6vB) \
ghc-semigroups-prof \
ghc-semigroups-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-semigroups-devel"

inherit rpm
