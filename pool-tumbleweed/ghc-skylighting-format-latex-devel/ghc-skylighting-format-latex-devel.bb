SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.3.aarch64.rpm"
RPM_HASH = "5059b85b42122865ed7f9eee77d713308bad662e0c04e7e0e3d503269b27e67e912a773c45ae541ede09d3923b0bd1b9f9a92b047908bd8e95021d9e76d92a18"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-BfMH5Wq0cc5AFSMLgsgxu \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.2.1-6o4V0mA5OWyEHmMDE2dJ63 \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-latex"

inherit rpm
