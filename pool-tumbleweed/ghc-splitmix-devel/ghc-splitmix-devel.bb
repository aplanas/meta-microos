SUMMARY = "Haskell splitmix library development files"
DESCRIPTION = "This package provides the Haskell splitmix library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-devel-0.1.0.4-4.8.aarch64.rpm"
RPM_HASH = "0dd43a844d840ac89fa839e2ad38c3a10d9dc8143e7e2c654fc51671bfcb1017681f405279de61650988712eb9911116d429a7f20bb156de11abeec091ed52b9"

RPROVIDES:${PN} += "ghc-devel-splitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O \
ghc-splitmix-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-splitmix"

inherit rpm
