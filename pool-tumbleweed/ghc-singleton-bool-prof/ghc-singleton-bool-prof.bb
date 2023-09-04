SUMMARY = "Haskell singleton-bool profiling library"
DESCRIPTION = "This package provides the Haskell singleton-bool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-prof-0.1.6-4.4.aarch64.rpm"
RPM_HASH = "098b2cecddc9f93c941f170ef448c137ad60b100d8caae554b04ea3aa4568ebcc36271edc6bc7057c7d4fcdc4e242f2275550aa6f2a602776ef43e9c6c1b3ad0"

RPROVIDES:${PN} += "ghc-prof-singleton-bool-0.1.6-32zI19nhSdNCZbR5BPJbeE \
ghc-singleton-bool-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-boring-0.2.1-8UoR96J8uAp13B13xTdCnI \
ghc-prof-dec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-some-1.0.5-EryUniFNYOB2ktd7SoyKUW \
ghc-singleton-bool-devel"

inherit rpm
