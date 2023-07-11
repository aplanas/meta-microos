SUMMARY = "Haskell digest library development files"
DESCRIPTION = "This package provides the Haskell digest library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-devel-0.0.1.7-1.6.aarch64.rpm"
RPM_HASH = "03d94c9a0f8413da9f008d29f469e021b7ad517f40e24d301398db4dd311a2168a636dc4ddd3d73b4575c1d9a024a0291013090c0f583b42ff0cd077158038f6"

RPROVIDES:${PN} += "ghc-devel-digest-0.0.1.7-CCCN8814sFy3HuiyT8t94G \
ghc-digest-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-digest \
pkgconfig \
pkgconfig-zlib"

inherit rpm
