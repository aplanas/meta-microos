SUMMARY = "Haskell ordered-containers library development files"
DESCRIPTION = "This package provides the Haskell ordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-devel-0.2.3-1.3.aarch64.rpm"
RPM_HASH = "150def46fe927f21cda2ec3aab623feb408ffd965268623e50de1d8abec0a3396d142a3b0be105d2d77f6266421c0e70ecb97a8d7258a6c6f0d767200de0a4db"

RPROVIDES:${PN} += "ghc-devel-ordered-containers-0.2.3-2vvzHwtaKIjK7BBzxceSWT \
ghc-ordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-ordered-containers"

inherit rpm
