SUMMARY = "GHC library documentation indexing"
DESCRIPTION = "The package enables re-indexing of installed library documention."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-doc-index-9.4.5-3.2.noarch.rpm"
RPM_HASH = "c5915b1b79aaa30a30983f86b54b6486cc800c949d5480cf165fc1d3c4429ee800f15900cf4d3349549930567bdc45c905e2f3169c0014be151cf2672868e6ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doc-index"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
