SUMMARY = "Haskell code-page profiling library"
DESCRIPTION = "This package provides the Haskell code-page profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-prof-0.2.1-2.5.aarch64.rpm"
RPM_HASH = "e1208c617464cc7529e4d7214f375356874aa65c52b12249074a883e96a86a0b3890b74ef39e3114bf28b09fd94dc2bef1216c64b69fcee978e0feb3f917e6f8"

RPROVIDES:${PN} += "ghc-code-page-prof \
ghc-prof-code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D"

RDEPENDS:${PN} += "ghc-code-page-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
