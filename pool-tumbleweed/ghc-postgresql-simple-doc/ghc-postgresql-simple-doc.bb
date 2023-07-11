SUMMARY = "Haskell postgresql-simple library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.5"

RPM_NAME = "ghc-postgresql-simple-doc-0.6.5-3.7.noarch.rpm"
RPM_HASH = "ed3cd0972725bf17d8207c87c4f8481e75000531c60de9dd85823ef8dfa8e98bda45d20e7a150d5ef63515fb9b598b2239838f244a61808689006eb57bcf5bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
