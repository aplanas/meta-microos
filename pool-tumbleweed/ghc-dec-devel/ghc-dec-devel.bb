SUMMARY = "Haskell dec library development files"
DESCRIPTION = "This package provides the Haskell dec library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "ghc-dec-devel-0.0.5-2.4.aarch64.rpm"
RPM_HASH = "96a7a080044bcee7e71b58c87fd336f3a27a04b514fb4b367761332c950d1929c1d0afd24b91189637cdee0e57670fabe474f70b1c2e857607162132b0616873"

RPROVIDES:${PN} += "ghc-dec-devel \
ghc-devel-dec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-dec \
ghc-devel-base-4.17.2.0 \
ghc-devel-boring-0.2.1-8UoR96J8uAp13B13xTdCnI"

inherit rpm
