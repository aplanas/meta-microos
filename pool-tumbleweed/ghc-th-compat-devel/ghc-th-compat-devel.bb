SUMMARY = "Haskell th-compat library development files"
DESCRIPTION = "This package provides the Haskell th-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.4"

RPM_NAME = "ghc-th-compat-devel-0.1.4-3.1.aarch64.rpm"
RPM_HASH = "acbf5601c2d52521629c8978d8abde7c0feb05c57a434fb207151b0d098a3009ce0dcd7c2eda0c11e8eeaefb92dc2307070f4c12e33fe836b8d750d24b8d9c7a"

RPROVIDES:${PN} += "ghc-devel-th-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS \
ghc-th-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-th-compat"

inherit rpm
