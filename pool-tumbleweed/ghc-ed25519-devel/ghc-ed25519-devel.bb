SUMMARY = "Haskell ed25519 library development files"
DESCRIPTION = "This package provides the Haskell ed25519 library development files."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-devel-0.0.5.0-16.4.aarch64.rpm"
RPM_HASH = "cd7ce3f7530dc1e0e16f1c3fb2c60f4814af66599857f5f794043c3688e8e676aeffcef6474f0b1d250848375b667bfbcd331d5a196f58018ad7c8e396917deb"

RPROVIDES:${PN} += "ghc-devel-ed25519-0.0.5.0-5X6chYMa5zJHtTD7kmYRr0 \
ghc-ed25519-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-ghc-prim-0.9.1 \
ghc-ed25519"

inherit rpm
