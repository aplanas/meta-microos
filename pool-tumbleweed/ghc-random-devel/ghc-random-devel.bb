SUMMARY = "Haskell random library development files"
DESCRIPTION = "This package provides the Haskell random library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-devel-1.2.1.1-2.3.aarch64.rpm"
RPM_HASH = "d275686cf5facafc8770ff7446e0bfbe4b6ef0169847ad1eb21e3ae96a582908032150b21292a893f5bf36c3f399caa3d4ba37da1515e7df1e82510c760c6056"

RPROVIDES:${PN} += "ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-random-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-splitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O \
ghc-random"

inherit rpm
