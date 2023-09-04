SUMMARY = "Haskell unicode-data library development files"
DESCRIPTION = "This package provides the Haskell unicode-data library development files."
LICENSE = "Apache-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-data-devel-0.4.0.1-3.8.aarch64.rpm"
RPM_HASH = "bce16920833caf7ec59c7d6daa263c8ca4b7d66b67c3f2fce13597a7ceebce6ad63f565c0186599cebd00d15e130739495e90f28e417d9c5e35c928281930b56"

RPROVIDES:${PN} += "ghc-devel-unicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr \
ghc-unicode-data-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-unicode-data"

inherit rpm
