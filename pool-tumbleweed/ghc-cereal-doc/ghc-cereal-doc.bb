SUMMARY = "Haskell cereal library documentation"
DESCRIPTION = "This package provides the Haskell cereal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-doc-0.5.8.3-2.3.noarch.rpm"
RPM_HASH = "5fd765a138ef1a9e94ae01714f1a939b8c79ea4c26b2dae739f183cf778cd36a9d3124c86617d4cf9155710a55a057fc053ff7f4adf5d1fdb1fe65165e648d8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cereal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
