SUMMARY = "Haskell iwlib profiling library"
DESCRIPTION = "This package provides the Haskell iwlib profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-prof-0.1.2-2.3.aarch64.rpm"
RPM_HASH = "2cca1a7b60e781022bcb4ae57bf983b14b1c432195a08fc8e00dafe3d3115f6724c40ba85bea429f6213e9eba7fe6e0abf545505181fa1992f6a8ff1cb6b974f"

RPROVIDES:${PN} += "ghc-iwlib-prof \
ghc-prof-iwlib-0.1.2-DBPHxQHnFovIGpbAOJfyp4"

RDEPENDS:${PN} += "ghc-iwlib-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
