SUMMARY = "Haskell array library development files"
DESCRIPTION = "This package provides the Haskell array library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-devel-0.5.4.0-1.1.aarch64.rpm"
RPM_HASH = "937f610ce52be0c3448d8e489051f166515f16e184dbf9f19b6e7f377541d39c8d99538d5f0050e73417fdb69f2d13d6c305008791658924f849b161f8321eaf"

RPROVIDES:${PN} += "ghc-array-devel \
ghc-array-static \
ghc-devel-array-0.5.4.0"

RDEPENDS:${PN} += "ghc-array \
ghc-compiler \
ghc-devel-base-4.17.2.0"

inherit rpm
