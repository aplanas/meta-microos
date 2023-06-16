SUMMARY = "Haskell microlens library development files"
DESCRIPTION = "This package provides the Haskell microlens library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-devel-0.4.13.1-2.2.aarch64.rpm"
RPM_HASH = "c88a0dcbfa7408d470e14bc13554fd562b718c3dd7cfeeb13179f7dceec540a109f87142c0cfd3a4dfee94c1a51ab4d2f2bf4c284183d350dd192f3a50a89d8b"

RPROVIDES:${PN} += "ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-microlens-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-microlens"

inherit rpm
