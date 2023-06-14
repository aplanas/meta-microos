SUMMARY = "Haskell data-default-instances-dlist profiling library"
DESCRIPTION = "This package provides the Haskell data-default-instances-dlist profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-dlist-prof-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "7d6ab9d0affbf5fdc9c463579d951711f40fb60f5f8eecf1b60c9d4c9b6cdeee812bde8a10f9c904e30163095764947c4832e1d0c671c172fcc78fad1c41e3d0"

RPROVIDES:${PN} += "ghc-data-default-instances-dlist-prof \
ghc-prof-data-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf"

RDEPENDS:${PN} += "ghc-data-default-instances-dlist-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-dlist-1.0-BmTLN13CmmLQvuHz7BjP9"

inherit rpm
