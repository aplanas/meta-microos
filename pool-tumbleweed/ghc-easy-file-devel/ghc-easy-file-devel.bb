SUMMARY = "Haskell easy-file library development files"
DESCRIPTION = "This package provides the Haskell easy-file library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-easy-file-devel-0.2.3-1.3.aarch64.rpm"
RPM_HASH = "6dfe5ea481ae968ed5d6f36c9f92b13f3108cdc8256615a7159f959b0dcb010daeeffb2784c55bc660a37a89d57dbbe9e9651aa456c1b7da5565b7860f8dc176"

RPROVIDES:${PN} += "ghc-devel-easy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4 \
ghc-easy-file-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-easy-file"

inherit rpm
