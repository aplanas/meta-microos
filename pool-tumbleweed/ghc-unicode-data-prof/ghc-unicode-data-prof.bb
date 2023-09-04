SUMMARY = "Haskell unicode-data profiling library"
DESCRIPTION = "This package provides the Haskell unicode-data profiling library."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-prof-0.4.0.1-3.8.aarch64.rpm"
RPM_HASH = "a760b5702b598129bd45132ebb9217aaf8085a524d5cd4cdfb62e4d5ce51983d2cb62b6dafba7244e810b4631e877849d598a3f894f002f282ad7f90b50b7eca"

RPROVIDES:${PN} += "ghc-prof-unicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr \
ghc-unicode-data-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-unicode-data-devel"

inherit rpm
