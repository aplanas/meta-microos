SUMMARY = "Haskell cmdargs library development files"
DESCRIPTION = "This package provides the Haskell cmdargs library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-devel-0.10.22-1.8.aarch64.rpm"
RPM_HASH = "9dc639505ac45d76fdb8711459db1bd118bf48c5f42250061fa934070db33b7cff16eb032112239d0109194855382c3ddeace92521384630bb92ac8339b219eb"

RPROVIDES:${PN} += "ghc-cmdargs-devel \
ghc-devel-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cmdargs \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
