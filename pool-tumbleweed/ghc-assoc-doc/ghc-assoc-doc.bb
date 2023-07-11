SUMMARY = "Haskell assoc library documentation"
DESCRIPTION = "This package provides the Haskell assoc library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-doc-1.1-1.3.noarch.rpm"
RPM_HASH = "b7c0a214c1ea740a5355547ecd55757ea949957b211388045e1e3cd46321f390ae54994155f325cd463b4a59760fd116512b36f9904988b137338e0625f11594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-assoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
