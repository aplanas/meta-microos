SUMMARY = "Haskell js-chart library development files"
DESCRIPTION = "This package provides the Haskell js-chart library development files."
LICENSE = "MIT"

PV = "2.9.4.1"

RPM_NAME = "ghc-js-chart-devel-2.9.4.1-2.3.aarch64.rpm"
RPM_HASH = "e9b7212297ba49fb6c2c71fc8d8de4510900627b8e5a6a5037b801a56cec319d2f58929ab6264abd1c1c48e163e5ac1efdbdce066487a355e1fb5c70b5a886d8"

RPROVIDES:${PN} += "ghc-devel-js-chart-2.9.4.1-JVxU4FDcB7p8n92cFFYHGl \
ghc-js-chart-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-js-chart"

inherit rpm
