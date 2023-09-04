SUMMARY = "Haskell pretty-hex library documentation"
DESCRIPTION = "This package provides the Haskell pretty-hex library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-doc-1.1-4.3.noarch.rpm"
RPM_HASH = "35c278326a0e00b4a29c7708806d6ddaf096eecb435fc79504ea451219ec7da40ecad48369ba808551e8ea67c7ce45c911eb0398710791de057f256f1be6e068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-hex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
