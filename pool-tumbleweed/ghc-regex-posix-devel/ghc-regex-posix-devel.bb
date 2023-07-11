SUMMARY = "Haskell regex-posix library development files"
DESCRIPTION = "This package provides the Haskell regex-posix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.96.0.1"

RPM_NAME = "ghc-regex-posix-devel-0.96.0.1-3.6.aarch64.rpm"
RPM_HASH = "7ff9b98829469db1246f2755dd18a31aa54c1cb58fc1457912c827ee9320e518df4df22534ddcf5d085865254fcb1e28ce2121abedb00a7ee4b045bac7cc0e23"

RPROVIDES:${PN} += "ghc-devel-regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1 \
ghc-regex-posix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-posix"

inherit rpm
