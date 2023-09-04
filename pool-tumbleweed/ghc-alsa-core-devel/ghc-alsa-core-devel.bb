SUMMARY = "Haskell alsa-core library development files"
DESCRIPTION = "This package provides the Haskell alsa-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-devel-0.5.0.1-4.4.aarch64.rpm"
RPM_HASH = "db71bd4f7f288c690c2fad56f87054467a34e22289adec5691c5d49a1e1caf65d482b41c86a3a91834fe7acb92068afc72a06dbcc11324e2862d33e4ea95680b"

RPROVIDES:${PN} += "ghc-alsa-core-devel \
ghc-devel-alsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-alsa-core \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e \
pkgconfig \
pkgconfig-alsa"

inherit rpm
