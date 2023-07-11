SUMMARY = "Haskell hslua-core library development files"
DESCRIPTION = "This package provides the Haskell hslua-core library development files."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-devel-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "1d141ef6d5364ae7a26df708a4bf3a204012e27495b688609278641d5dcc2d9b9095f1745640c88c6bb16c43b3e1b2f290ef769c8d9a4a4e4d47cb6638c4f666"

RPROVIDES:${PN} += "ghc-devel-hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC \
ghc-hslua-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-core"

inherit rpm
