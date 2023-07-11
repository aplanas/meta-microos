SUMMARY = "Haskell vault profiling library"
DESCRIPTION = "This package provides the Haskell vault profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-prof-0.3.1.5-4.6.aarch64.rpm"
RPM_HASH = "92a71b6eda38244991f7a0ac5ea4bf10c5f64093655892189dfcf9b1fc5745463d30e217d60a3d90ea947378a651f8b132a9ad6ee3401d04168e26a0fba52542"

RPROVIDES:${PN} += "ghc-prof-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-vault-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-vault-devel"

inherit rpm
