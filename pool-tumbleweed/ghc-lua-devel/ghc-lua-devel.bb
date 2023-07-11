SUMMARY = "Haskell lua library development files"
DESCRIPTION = "This package provides the Haskell lua library development files."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-devel-2.3.1-1.6.aarch64.rpm"
RPM_HASH = "f65f85264974180fa19521e0b6b64371b94727d08e2ef833cf20586e58d619d50ae831f7cbd3620aab80f432c60c6e359f97c9685c798203f9989e41e49dd648"

RPROVIDES:${PN} += "ghc-devel-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-lua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-lua"

inherit rpm
