SUMMARY = "Haskell terminal-size library development files"
DESCRIPTION = "This package provides the Haskell terminal-size library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-devel-0.3.4-1.3.aarch64.rpm"
RPM_HASH = "fa9d9a8e8689139a223702a17d9187bf75e5abcff160c90680db2c6902cd510e7a031050ce9cf11ed8b59b4d632e06613b1782eb3f7a360ee28cf175304cf994"

RPROVIDES:${PN} += "ghc-devel-terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd \
ghc-terminal-size-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-terminal-size"

inherit rpm
