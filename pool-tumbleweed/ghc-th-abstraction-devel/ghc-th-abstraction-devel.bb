SUMMARY = "Haskell th-abstraction library development files"
DESCRIPTION = "This package provides the Haskell th-abstraction library development files."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-devel-0.4.5.0-2.6.aarch64.rpm"
RPM_HASH = "9c114bdee77eee8d9e9b032394bfddcd24506887b7aeab79b1c28c3e3594ed7a5840a2b53506faa40fb53a033f963c4bb42d1d10bdc5df43716a3351914ca238"

RPROVIDES:${PN} += "ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-th-abstraction-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-th-abstraction"

inherit rpm
