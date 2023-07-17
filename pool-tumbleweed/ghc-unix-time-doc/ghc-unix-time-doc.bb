SUMMARY = "Haskell unix-time library documentation"
DESCRIPTION = "This package provides the Haskell unix-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-doc-0.4.10-1.1.noarch.rpm"
RPM_HASH = "961f27490b90bb6511fbb5ea5c7b14fadbf982fe0de7d454ae055f2010c578cf9897df02c26111a5b75b7abd6196f4c2913dc905394b8034a6db1a74309ed0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
