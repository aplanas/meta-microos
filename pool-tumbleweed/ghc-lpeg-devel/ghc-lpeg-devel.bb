SUMMARY = "Haskell lpeg library development files"
DESCRIPTION = "This package provides the Haskell lpeg library development files."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-devel-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "c81bea43116d56bfcd5d6ad082c29a9cd77f9a429e71188d3c71fb1283ffd41705f58071f8e73d8027bdb2050f9997da5664f19cb32b9b69adc36e5c9c3d8edf"

RPROVIDES:${PN} += "ghc-devel-lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9 \
ghc-lpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-lpeg"

inherit rpm
