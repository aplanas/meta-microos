SUMMARY = "Haskell uniplate library development files"
DESCRIPTION = "This package provides the Haskell uniplate library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-devel-1.6.13-4.6.aarch64.rpm"
RPM_HASH = "1e0df64f003c40d980b07828619cf2b35655c072e8e0aa0623ff75f6678d5fe6f865dd5d713ea9bca574a696db3bcd55f2b2a90fc35133f204e3e1c55893a971"

RPROVIDES:${PN} += "ghc-devel-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-uniplate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-uniplate"

inherit rpm
