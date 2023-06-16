SUMMARY = "Haskell hinotify library development files"
DESCRIPTION = "This package provides the Haskell hinotify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-devel-0.4.1-3.2.aarch64.rpm"
RPM_HASH = "bc4f83b9d2aaf90f3d68bd777a303f9b6fa09ac3a8f1ed55c62f442e45fecf89f42b2263eabb6a5992fd5b284413dead10012afbb195058462552695972dbf65"

RPROVIDES:${PN} += "ghc-devel-hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3 \
ghc-hinotify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-unix-2.7.3 \
ghc-hinotify"

inherit rpm
