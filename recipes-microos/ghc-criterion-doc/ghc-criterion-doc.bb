SUMMARY = "Haskell criterion library documentation"
DESCRIPTION = "This package provides the Haskell criterion library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.6.0.0"

RPM_NAME = "ghc-criterion-doc-1.6.0.0-2.4.noarch.rpm"
RPM_HASH = "4cb05d2110216d40bb542f02400d262fd4fbc1b93c85842ebaf2b8447a85b83dafb87bbdba95b30f1826536931ee7b309e871c373799545ebc4b13129a5bb2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-criterion-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
