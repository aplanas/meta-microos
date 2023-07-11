SUMMARY = "Haskell cryptohash-sha256 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-devel-0.11.102.1-3.6.aarch64.rpm"
RPM_HASH = "5c4b2ddc3616c70f5b75f30ddb92366f31b3dcd36345b6e921b60dfac2107edeaf08ae523d1c27987025920a905476c47039aff4dfe37341eabc5a412787ac58"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-devel \
ghc-devel-cryptohash-sha256-0.11.102.1-Hqbk8cbDzn9JgCAqvbhMBD"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-sha256 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
