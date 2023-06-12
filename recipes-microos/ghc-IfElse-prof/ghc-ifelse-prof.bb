SUMMARY = "Haskell IfElse profiling library"
DESCRIPTION = "This package provides the Haskell IfElse profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-prof-0.85-4.2.aarch64.rpm"
RPM_HASH = "5904f3d6a832c13deffa0f6de3a9fcafe42a4500f1ca55d8348b0f6c9a9f308789cc536fe24175d96e98245b3c603a851f6bf355363ca27efe8a9d029e4f298e"

RPROVIDES:${PN} += "ghc-IfElse-prof \
ghc-IfElse-prof(aarch-64) \
ghc-prof(IfElse-0.85-7KBtFS87aFz8e1Xg4MUrMX)"
RDEPENDS:${PN} += "ghc-IfElse-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(mtl-2.2.2)"

inherit rpm
