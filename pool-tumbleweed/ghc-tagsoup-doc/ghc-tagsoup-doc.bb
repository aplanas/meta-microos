SUMMARY = "Haskell tagsoup library documentation"
DESCRIPTION = "This package provides the Haskell tagsoup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-doc-0.14.8-6.6.noarch.rpm"
RPM_HASH = "4be152a9775e10f986e9096cc1826bea0b9386b7611963b2329b519d88e8b5ecec30c379ba48af5fc6c81292ccc50e96a378e6435d2d8d257201949a579ca31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagsoup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
