SUMMARY = "Haskell unliftio-core library development files"
DESCRIPTION = "This package provides the Haskell unliftio-core library development files."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-devel-0.2.1.0-1.8.aarch64.rpm"
RPM_HASH = "566d0083dff705387cb60e64a9ca897b9b589bd7e91d73a1ad9c6df44a1f48d5a3add0f2c1782520c55ef2cca3a5199825e83e5a32aae76aad531cbe2fe1a3c8"

RPROVIDES:${PN} += "ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-unliftio-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-unliftio-core"

inherit rpm
