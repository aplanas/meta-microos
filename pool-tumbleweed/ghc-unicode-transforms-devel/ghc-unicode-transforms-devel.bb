SUMMARY = "Haskell unicode-transforms library development files"
DESCRIPTION = "This package provides the Haskell unicode-transforms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-devel-0.4.0.1-4.8.aarch64.rpm"
RPM_HASH = "7a5b66049c5c9ccbd0a9e695e0eabbb2c679b64dc42b89cd9266da8a72e7a6207f39db3ad4a1145a109e331c0ef57494359e0ee72ceff63ee7e28a0450e97763"

RPROVIDES:${PN} += "ghc-devel-unicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24 \
ghc-unicode-transforms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr \
ghc-unicode-transforms"

inherit rpm
