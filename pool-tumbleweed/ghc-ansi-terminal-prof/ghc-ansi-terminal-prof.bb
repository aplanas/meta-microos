SUMMARY = "Haskell ansi-terminal profiling library"
DESCRIPTION = "This package provides the Haskell ansi-terminal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-prof-0.11.5-1.2.aarch64.rpm"
RPM_HASH = "c698b4384be6b938a3c16f99a808b8b5a44e1f5b849ce529e9c8bc279a481e151d8981fc8194315669b3a3fd802cc7d83841e03f61acb202942765f301de8eac"

RPROVIDES:${PN} += "ghc-ansi-terminal-prof \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3"

RDEPENDS:${PN} += "ghc-ansi-terminal-devel \
ghc-prof-ansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR \
ghc-prof-base-4.17.1.0 \
ghc-prof-colour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln"

inherit rpm
