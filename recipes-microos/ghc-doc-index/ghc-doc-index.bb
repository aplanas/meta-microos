SUMMARY = "GHC library documentation indexing"
DESCRIPTION = "The package enables re-indexing of installed library documention."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-doc-index-9.4.5-1.1.noarch.rpm"
RPM_HASH = "c7e236beeab299a7ced24b4a2492e83372d53f52a2b869e873a71db7e298af68cc51eeeed909f0d797de83edfc46111141f7103ed3edf2480b9cd094d1d4cfe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doc-index"
RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
