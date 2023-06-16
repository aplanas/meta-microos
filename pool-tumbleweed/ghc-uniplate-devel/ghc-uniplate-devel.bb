SUMMARY = "Haskell uniplate library development files"
DESCRIPTION = "This package provides the Haskell uniplate library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-devel-1.6.13-4.3.aarch64.rpm"
RPM_HASH = "a6511d82cd305d2e119506a96e95278dc8462498f246c6e216be718c3901cce8ace3876ae1b96b9479ee1b968094861b443fe9212fb2389c133fdc8116eb70fa"

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
