SUMMARY = "Haskell cryptohash-sha1 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-devel-0.11.101.0-4.3.aarch64.rpm"
RPM_HASH = "5a4a51436b836a4535bfcad4da8693da94ab5a52c229ebaa31064575f3b151eb8fff4589b8dc681fe7b8e917f7397e621beece96bb39ec997853b14f00835184"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-devel \
ghc-devel-cryptohash-sha1-0.11.101.0-5MfQC56IvYq9IpSDMpmdHb"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-cryptohash-sha1 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
