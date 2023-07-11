SUMMARY = "Haskell utility-ht library documentation"
DESCRIPTION = "This package provides the Haskell utility-ht library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.17"

RPM_NAME = "ghc-utility-ht-doc-0.0.17-1.3.noarch.rpm"
RPM_HASH = "89ca0b8e25e9a4c20eafbccf328e3790f25e25be7d8a144e9bf48feb5728b4d65ded2bf01970085143a9c2f3467c47992420ecfeb0b42a8293b327e8b4cb8600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utility-ht-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
