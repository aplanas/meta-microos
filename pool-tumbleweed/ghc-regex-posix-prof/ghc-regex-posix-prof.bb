SUMMARY = "Haskell regex-posix profiling library"
DESCRIPTION = "This package provides the Haskell regex-posix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-prof-0.96.0.1-3.6.aarch64.rpm"
RPM_HASH = "db60b53278bb65e4a5101d44b9eeaaecc1cfa02dabcc60de77fa6ac8772a8a3f3cd2e68e93a51bca4497bb546ca1c6ebeb916b28d9de7b5fc9064b1d79a7112f"

RPROVIDES:${PN} += "ghc-prof-regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1 \
ghc-regex-posix-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-posix-devel"

inherit rpm
