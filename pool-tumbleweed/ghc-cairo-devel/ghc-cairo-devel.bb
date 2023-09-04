SUMMARY = "Haskell cairo library development files"
DESCRIPTION = "This package provides the Haskell cairo library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13.10.0"

RPM_NAME = "ghc-cairo-devel-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "0cf12f5dc641a4f0de1107125cd942caefbe7dc7942bced249d55d122344f1cda8ba339fcbcc9885c3cc6bd6936936193be3571a4db3d8378d0f8f213a334448"

RPROVIDES:${PN} += "ghc-cairo-devel \
ghc-devel-cairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cairo \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
pkgconfig \
pkgconfig-cairo \
pkgconfig-cairo-pdf \
pkgconfig-cairo-ps \
pkgconfig-cairo-svg"

inherit rpm
