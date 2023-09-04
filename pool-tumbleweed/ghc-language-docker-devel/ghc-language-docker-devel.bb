SUMMARY = "Haskell language-docker library development files"
DESCRIPTION = "This package provides the Haskell language-docker library development \
files."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-devel-11.0.0-1.10.aarch64.rpm"
RPM_HASH = "eec10eead7ce807bac1495c0119fa38aefa65027463e7ec2e9de734410c0faab46a85573ec3fa83afcd5728422da1a590841c6106c453a28c6720d3e5893ef28"

RPROVIDES:${PN} += "ghc-devel-language-docker-11.0.0-2HEqMTVikVZEgpsCXsz3Cq \
ghc-language-docker-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-devel-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-language-docker"

inherit rpm
