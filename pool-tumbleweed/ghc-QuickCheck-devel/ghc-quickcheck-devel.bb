SUMMARY = "Haskell QuickCheck library development files"
DESCRIPTION = "This package provides the Haskell QuickCheck library development files."
LICENSE = "BSD-3-Clause"

PV = "2.14.3"

RPM_NAME = "ghc-QuickCheck-devel-2.14.3-1.5.aarch64.rpm"
RPM_HASH = "c8095e2794112cce34c0aac8f553517eaa8e7e04fd8a83b91aec4ff5ef71d2791f0725c3c1d4aafce8a9ebe01f3d3dbf0bb431b68cbac38acdb162251a81f7f0"

RPROVIDES:${PN} += "ghc-QuickCheck-devel \
ghc-devel-QuickCheck-2.14.3-EdzpnPTYr1uH7EoNAOpgI8"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-QuickCheck \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-splitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
