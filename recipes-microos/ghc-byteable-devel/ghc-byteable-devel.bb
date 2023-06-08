SUMMARY = "Haskell byteable library development files"
DESCRIPTION = "This package provides the Haskell byteable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-byteable-devel-0.1.1-12.2.aarch64.rpm"
RPM_HASH = "a6035b81582bf105963cbe256754b87476ea271f756edd05fc364d2e0414f29c07924694123d25962cf41d2457eaeea433b7006d090e483ce67a778704ec4461"

RPROVIDES:${PN} += "ghc-byteable-devel ghc-byteable-devel(aarch-64) ghc-devel(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg)"
RDEPENDS:${PN} += "/bin/sh ghc-byteable ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0)"

inherit rpm
