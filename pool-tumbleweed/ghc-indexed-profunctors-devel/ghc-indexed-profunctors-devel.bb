SUMMARY = "Haskell indexed-profunctors library development files"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-indexed-profunctors-devel-0.1.1-2.2.aarch64.rpm"
RPM_HASH = "8df39ef387e49b2da361f10407aab5ed70c4a9ec7542e8bdb1775f606acef05c3e3254a7680867df2aad41f77dc65dc962d2041f8eefc556335a62b8a87fa8e4"

RPROVIDES:${PN} += "ghc-devel-indexed-profunctors-0.1.1-8slbuH4IUUg1HsCF6rf8GV \
ghc-indexed-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-indexed-profunctors"

inherit rpm
