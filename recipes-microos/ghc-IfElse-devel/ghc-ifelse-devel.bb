SUMMARY = "Haskell IfElse library development files"
DESCRIPTION = "This package provides the Haskell IfElse library development files."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-devel-0.85-4.2.aarch64.rpm"
RPM_HASH = "4f0de4773223acac754b9994d7314af157000dfe51e6e94bd5c7430dc8b43fb64695f46b3e805056d22852f334ecfb45407c658efb9144f130debed172ffd3c2"

RPROVIDES:${PN} += "ghc-IfElse-devel ghc-IfElse-devel(aarch-64) ghc-devel(IfElse-0.85-7KBtFS87aFz8e1Xg4MUrMX)"
RDEPENDS:${PN} += "/bin/sh ghc-IfElse ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(mtl-2.2.2)"

inherit rpm
