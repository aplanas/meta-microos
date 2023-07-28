SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.5.aarch64.rpm"
RPM_HASH = "580f9a919bbe8b9a70037ad65e0abc69b87df9c59b2c873a798d17517092624714d2ce855b936a71b421f52f79ac519b3f882673b9ae74ac57307f0d1215bce8"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-context-0.1.0.2-DaN7b6FAIhw69Ip8uy59f9 \
ghc-skylighting-format-context-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4-ILWFndoUOH7DzXIN7Ztglj \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-context"

inherit rpm
