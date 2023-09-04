SUMMARY = "Haskell githash profiling library"
DESCRIPTION = "This package provides the Haskell githash profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-prof-0.1.7.0-1.5.aarch64.rpm"
RPM_HASH = "ac037afeb67adfd94c4d4e8ba2d3f9b88f0a4810dfb3359d7c3eb1380b71079a1e8c4cdc4f2d3d34c7e9946dd8082ca1c300753d29bd64fdf9015c5627bcf18b"

RPROVIDES:${PN} += "ghc-githash-prof \
ghc-prof-githash-0.1.7.0-AdGnnqehkm8HwhDMWfn4qF"

RDEPENDS:${PN} += "ghc-githash-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS"

inherit rpm
