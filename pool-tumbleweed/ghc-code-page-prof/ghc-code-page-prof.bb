SUMMARY = "Haskell code-page profiling library"
DESCRIPTION = "This package provides the Haskell code-page profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-code-page-prof-0.2.1-2.2.aarch64.rpm"
RPM_HASH = "b32358876950836c2dd61afc1b22681044b27bdcacc21a100174df502fd73fd4ae4c5ab8f60b48f0e2b80e224dbd84e551d14cdf991adb26efedd8a1b5e031f5"

RPROVIDES:${PN} += "ghc-code-page-prof \
ghc-code-page-prof(aarch-64) \
ghc-prof(code-page-0.2.1-DXkPgctk3OAKMpgAjUBS3D)"
RDEPENDS:${PN} += "ghc-code-page-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
