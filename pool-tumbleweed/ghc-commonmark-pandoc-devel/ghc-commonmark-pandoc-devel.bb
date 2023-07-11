SUMMARY = "Haskell commonmark-pandoc library development files"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-devel-0.2.1.3-2.4.aarch64.rpm"
RPM_HASH = "e01bf839930e6ffb0c010fb42f47c2d7985a71cbf8e53fc1705a35474e4274c24b4adf840e6e3d54fda63ad86701f4ebdcc80774e559ce06036e879007605356"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-devel \
ghc-devel-commonmark-pandoc-0.2.1.3-HVNPkFgx18RJMldDwlSrf3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-pandoc \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-devel-commonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-text-2.0.2"

inherit rpm
