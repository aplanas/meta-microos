SUMMARY = "Haskell uniplate profiling library"
DESCRIPTION = "This package provides the Haskell uniplate profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-prof-1.6.13-4.3.aarch64.rpm"
RPM_HASH = "de5fbeb371198005849dc552ea3022e7ee0a7365d93d185284e417b74a561fc32b039eed1ed1abb74b144c5a8a911940f8c439c624dd609baed8d2d6debe826c"

RPROVIDES:${PN} += "ghc-prof(uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN) \
ghc-uniplate-prof \
ghc-uniplate-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(syb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-uniplate-devel"

inherit rpm
