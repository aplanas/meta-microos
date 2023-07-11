SUMMARY = "Haskell cryptohash-sha1 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-devel-0.11.101.0-4.6.aarch64.rpm"
RPM_HASH = "98da5acbb370262d719ad3d29962cf4601557186819d5cfb746c69cbab82f46633294264a8c4d78bcb30e05192d3deba340aebc881967edc18d1edf2a4af5a09"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-devel \
ghc-devel-cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-sha1 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
