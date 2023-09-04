SUMMARY = "Haskell singleton-bool library development files"
DESCRIPTION = "This package provides the Haskell singleton-bool library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-devel-0.1.6-4.4.aarch64.rpm"
RPM_HASH = "7a7f6a5f8a9a5d31b5e2866451acf8d5c555462b3151a3702449d62a8177229cf16c8a563e0e0c5c4bd2e65caa1d7904a3e7407d6514629b4624550217b2a4a4"

RPROVIDES:${PN} += "ghc-devel-singleton-bool-0.1.6-32zI19nhSdNCZbR5BPJbeE \
ghc-singleton-bool-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-boring-0.2.1-8UoR96J8uAp13B13xTdCnI \
ghc-devel-dec-0.0.5-3eH9is9HBV5IuOX3KX0Ah7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-some-1.0.5-EryUniFNYOB2ktd7SoyKUW \
ghc-singleton-bool"

inherit rpm
