SUMMARY = "Haskell wizards library development files"
DESCRIPTION = "This package provides the Haskell wizards library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-devel-1.0.3-6.5.aarch64.rpm"
RPM_HASH = "8f74197c41b2149ba482ed809072c7e76ac5b51b48753720ccfc19dd005dd364173faaec04a695be983de45f93b85310ecf6971a132dc0aaf77b1c9ae4fccb96"

RPROVIDES:${PN} += "ghc-devel-wizards-1.0.3-4dF6xVc0i30CRerGIMRP2J \
ghc-wizards-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-control-monad-free-0.6.2-14mRW5Z3hOW3y0QtFAGsp6 \
ghc-devel-haskeline-0.8.2 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-wizards"

inherit rpm
