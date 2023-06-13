SUMMARY = "Haskell hjsmin profiling library"
DESCRIPTION = "This package provides the Haskell hjsmin profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-prof-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "52d56e72125707e0d7c2087ca65fd7a28d58aa93d8e85b98d278276f165591cc8c8c004efa75430fc3c96547ce43ad397598236b0bb7ec203a83a0dd5dec8d06"

RPROVIDES:${PN} += "ghc-hjsmin-prof \
ghc-hjsmin-prof(aarch-64) \
ghc-prof(hjsmin-0.2.1-G11T0ofJtyz5gQQf6GRgL1)"

RDEPENDS:${PN} += "ghc-hjsmin-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM) \
ghc-prof(text-2.0.2)"

inherit rpm
