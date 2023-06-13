SUMMARY = "Haskell hashable library documentation"
DESCRIPTION = "This package provides the Haskell hashable library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-doc-1.4.2.0-1.3.noarch.rpm"
RPM_HASH = "392aac9f944809276b47bd8868c484ea018fc1d0615e6a1a547026224b8bc4748c8f14ab059e46f3ec78997fdd1068c46062de2654f60a99279a52d1fe5a83de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
