SUMMARY = "Haskell cryptohash-sha1 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-doc-0.11.101.0-4.6.noarch.rpm"
RPM_HASH = "483131081ef3dc0c6cfa1db212341607f8e1df72a564600495eb5b30c16711fb343299abab6c3878bb8cb5419f0fb4cd7ac22ae772a23f574daa56d6180200a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
