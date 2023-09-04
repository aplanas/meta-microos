SUMMARY = "Haskell postgresql-simple library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.5.1"

RPM_NAME = "ghc-postgresql-simple-doc-0.6.5.1-1.4.noarch.rpm"
RPM_HASH = "51e52b36948d978c77b428cb6656af0f3e3915ce74cf977ce45d5053fe0f1238b99cbc388e3a4c5892c5cc4caaf929cf843744c094eb6f4b282b99a96af18a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
