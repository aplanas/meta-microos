SUMMARY = "Haskell cryptohash-sha1 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-devel-0.11.101.0-4.8.aarch64.rpm"
RPM_HASH = "ccd7cad61cb0d1788fab7fd172ed0db9dfdb913e82624e99f87bf02ce9d65b93428c72b429a9010fd52f1f73dafee64100b867f57fdae579c461bb7175b23e25"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-devel \
ghc-devel-cryptohash-sha1-0.11.101.0-6Awf3EmibUqDJxbZJLf3j4"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-sha1 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
