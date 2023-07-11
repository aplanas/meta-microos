SUMMARY = "Haskell uniplate profiling library"
DESCRIPTION = "This package provides the Haskell uniplate profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-prof-1.6.13-4.6.aarch64.rpm"
RPM_HASH = "183a78ee97b313618d21ae735cf92afa2691f58b88e6c7d69de222bc9db205672230c139ec9f7085adf5516fadd9c0f84d69559c96854744911114f293cc33cb"

RPROVIDES:${PN} += "ghc-prof-uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN \
ghc-uniplate-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-uniplate-devel"

inherit rpm
