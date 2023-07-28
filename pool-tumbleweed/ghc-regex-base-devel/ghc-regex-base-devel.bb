SUMMARY = "Haskell regex-base library development files"
DESCRIPTION = "This package provides the Haskell regex-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-devel-0.94.0.2-4.1.aarch64.rpm"
RPM_HASH = "85612943f920e16c86e22b7180bebfe26b97faff835bd8dd8e1c0ad8d43321135657842f0ec6ed2b7ca7e8767980091fae190d1dd651e64e7308b40afd355bdf"

RPROVIDES:${PN} += "ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-regex-base"

inherit rpm
