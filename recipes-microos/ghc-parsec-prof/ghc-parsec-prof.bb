SUMMARY = "Haskell parsec profiling library"
DESCRIPTION = "This package provides the Haskell parsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-prof-3.1.16.1-1.1.aarch64.rpm"
RPM_HASH = "980fa2f6eca84a566502b757829f6dada3392bcc56d017a66e2a2272ca741cb96b9c9e7e17e4d13dd08fcf3ab6a5cb5a7fd432c0a26068e350e63a709c36a26e"

RPROVIDES:${PN} += "ghc-parsec-prof ghc-parsec-prof(aarch-64) ghc-prof(parsec-3.1.16.1)"
RDEPENDS:${PN} += "ghc-parsec-devel(aarch-64) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(mtl-2.2.2) ghc-prof(text-2.0.2)"

inherit rpm
