SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.11.aarch64.rpm"
RPM_HASH = "0e61a8fe0681471601b1ba599533c4826dc6235204c003d3b15002d4c0b69b415c0ac8c1faebd66e43cce825ea84f26dd1fe90a5ee6ae8880b2068e97fc53336"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-context-0.1.0.2-4E6TECMrJ1JH7PHte3jxUC \
ghc-skylighting-format-context-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.4.1-LOkep7AnSNN7QJDAXr031n \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-context"

inherit rpm
