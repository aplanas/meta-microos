SUMMARY = "Haskell vault profiling library"
DESCRIPTION = "This package provides the Haskell vault profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1.5"

RPM_NAME = "ghc-vault-prof-0.3.1.5-4.3.aarch64.rpm"
RPM_HASH = "18490898e6a8d16786dc205ba491dd179d07e9a99b81de4c9b1087c0f7f46832601f1fba4c9749e241124862b7e4e0ab4318c64a1f55b000284570f8327c4345"

RPROVIDES:${PN} += "ghc-prof(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-vault-prof \
ghc-vault-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-vault-devel"

inherit rpm
