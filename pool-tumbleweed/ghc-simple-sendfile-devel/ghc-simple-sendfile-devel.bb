SUMMARY = "Haskell simple-sendfile library development files"
DESCRIPTION = "This package provides the Haskell simple-sendfile library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-devel-0.2.32-1.2.aarch64.rpm"
RPM_HASH = "31d4093967076271cd72c75c99a037d69d2b078b63f84fa7926cf5b10f5a017c2cf000bea3560c286a89b13acf7d945d39f6cb8e26c01a663a605f48bdb5eddc"

RPROVIDES:${PN} += "ghc-devel-simple-sendfile-0.2.32-4x5oTHfDDcT2QYoR9wedVb \
ghc-simple-sendfile-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-devel-unix-2.7.3 \
ghc-simple-sendfile"

inherit rpm
