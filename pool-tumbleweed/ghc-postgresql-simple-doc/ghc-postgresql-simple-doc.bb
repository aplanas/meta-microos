SUMMARY = "Haskell postgresql-simple library documentation"
DESCRIPTION = "This package provides the Haskell postgresql-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.5"

RPM_NAME = "ghc-postgresql-simple-doc-0.6.5-3.3.noarch.rpm"
RPM_HASH = "6a6a42314202b176ffc9370800c4b91a9b51864455273b5907e5469346e0277b676e3902996e9e6e115fe02814d324f5513c77c3b0cb92332d92eb614ebb5a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-postgresql-simple-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
