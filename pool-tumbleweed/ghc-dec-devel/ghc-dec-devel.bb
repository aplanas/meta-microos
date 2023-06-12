SUMMARY = "Haskell dec library development files"
DESCRIPTION = "This package provides the Haskell dec library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-devel-0.0.5-2.2.aarch64.rpm"
RPM_HASH = "04ff076333383b926b2bb23b937779721b0c0ed37908691dd0b01e5989a9d94bf57a65206fcdb4584770168cbfcdf3b8a766eb732977a048b9eb6ce8d84ac2bb"

RPROVIDES:${PN} += "ghc-dec-devel \
ghc-dec-devel(aarch-64) \
ghc-devel(dec-0.0.5-4k85S2UkQTWCpK3j0IuOFm)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-dec \
ghc-devel(base-4.17.1.0) \
ghc-devel(boring-0.2.1-J8lJX6Vz53r2bssyBwOtpl)"

inherit rpm
