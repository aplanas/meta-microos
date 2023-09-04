SUMMARY = "Haskell IfElse profiling library"
DESCRIPTION = "This package provides the Haskell IfElse profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-prof-0.85-4.3.aarch64.rpm"
RPM_HASH = "18112872e1230c8a927190ab0ea7e2de6bf7426217bafb4e9122ece4da2a425845dd3424c31e0eb2ab83029f3eae94dbad35c488f4f728c1f4736eca2c14f359"

RPROVIDES:${PN} += "ghc-IfElse-prof \
ghc-prof-IfElse-0.85-2pDYDhNcKvHGxAsencQysh"

RDEPENDS:${PN} += "ghc-IfElse-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-mtl-2.2.2"

inherit rpm
