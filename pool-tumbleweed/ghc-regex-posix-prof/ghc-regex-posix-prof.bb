SUMMARY = "Haskell regex-posix profiling library"
DESCRIPTION = "This package provides the Haskell regex-posix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-prof-0.96.0.1-4.1.aarch64.rpm"
RPM_HASH = "879691efbf350fe8225bd36c3f9be854a37660ba7f2490dfe46117f01e0af84ba18c645be3f4e17884944991211cc4bb8943eeaf35cf77649a7bd334604de362"

RPROVIDES:${PN} += "ghc-prof-regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1 \
ghc-regex-posix-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-posix-devel"

inherit rpm
