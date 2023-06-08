SUMMARY = "Haskell bytestring library development files"
DESCRIPTION = "This package provides the Haskell bytestring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-devel-0.11.4.0-1.1.aarch64.rpm"
RPM_HASH = "50f833cf16da0fdc69e3eb1f4d3116847c30ed5576270c618687d2bf6b9125c80c5e70db658266d274611ad71dee200f9858a0036426c7d5d5024190abf07cde"

RPROVIDES:${PN} += "ghc-bytestring-devel ghc-bytestring-devel(aarch-64) ghc-bytestring-static ghc-bytestring-static(aarch-64) ghc-devel(bytestring-0.11.4.0)"
RDEPENDS:${PN} += "ghc-bytestring(aarch-64) ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(ghc-prim-0.9.0) ghc-devel(template-haskell-2.19.0.0)"

inherit rpm
