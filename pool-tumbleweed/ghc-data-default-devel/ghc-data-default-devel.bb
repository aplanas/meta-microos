SUMMARY = "Haskell data-default library development files"
DESCRIPTION = "This package provides the Haskell data-default library development files."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-devel-0.7.1.1-10.3.aarch64.rpm"
RPM_HASH = "78f04eccce53b14e32b6826dad0e6545f867de14ddcd0060bd42c54707169b9c5338f5e7b3c577773dfa3eb000fbf044e4ff811b98d07f78b1b0f9d0c3d93503"

RPROVIDES:${PN} += "ghc-data-default-devel \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-data-default \
ghc-devel-base-4.17.2.0 \
ghc-devel-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-devel-data-default-instances-containers-0.0.1-HEdLgVFxVe7RkY046PWd1 \
ghc-devel-data-default-instances-dlist-0.0.1-GnwVNQzjXMiJZgAdRGSnEk \
ghc-devel-data-default-instances-old-locale-0.0.1-JPGD6DG1zci1Efipgkh66I"

inherit rpm
