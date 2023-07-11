SUMMARY = "Haskell commonmark-pandoc profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.3"

RPM_NAME = "ghc-commonmark-pandoc-prof-0.2.1.3-2.4.aarch64.rpm"
RPM_HASH = "3089aec131e7d5fd2d5f30c8fa6e0f7c26ee8fd30acfeefc759e88e94bbe7595ac4ad67883fa56ff857db4d19a9edfb7aa1d624166b7c94a76f17bd18a947704"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-prof \
ghc-prof-commonmark-pandoc-0.2.1.3-HVNPkFgx18RJMldDwlSrf3"

RDEPENDS:${PN} += "ghc-commonmark-pandoc-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-commonmark-0.2.3-I1mjDgOYrWfJTVx5dvVv0G \
ghc-prof-commonmark-extensions-0.2.3.4-lgOKfz42TuIWz23FZS91J \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-prof-text-2.0.2"

inherit rpm
