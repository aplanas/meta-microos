SUMMARY = "Haskell binary-orphans library development files"
DESCRIPTION = "This package provides the Haskell binary-orphans library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.4.1"

RPM_NAME = "ghc-binary-orphans-devel-1.0.4.1-1.3.aarch64.rpm"
RPM_HASH = "d155866796861c229697c40963193b8e6ec7939b63d9a1e28fdeb6c84bdcbf2c50cbb5b1670329057c9f8217696dff8defea1c8dfaf72436f6a25d933632da18"

RPROVIDES:${PN} += "ghc-binary-orphans-devel \
ghc-devel-binary-orphans-1.0.4.1-8AxRlqguR7DABM6SJeuldT"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-binary-orphans \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
