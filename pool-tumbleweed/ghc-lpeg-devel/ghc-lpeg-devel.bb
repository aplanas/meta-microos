SUMMARY = "Haskell lpeg library development files"
DESCRIPTION = "This package provides the Haskell lpeg library development files."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-devel-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "e63f6fec89cc0eda60bff2ad2c157a97e232f56a0720b8c4b11a66a95f2c1ccde194149093a1476db47585a9cac948b022f625fe4305c2b1d4581d5dbc4ce6bf"

RPROVIDES:${PN} += "ghc-devel-lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9 \
ghc-lpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-lpeg"

inherit rpm
