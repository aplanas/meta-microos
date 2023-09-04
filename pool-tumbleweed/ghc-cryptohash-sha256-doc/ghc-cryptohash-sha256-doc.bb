SUMMARY = "Haskell cryptohash-sha256 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-doc-0.11.102.1-3.8.noarch.rpm"
RPM_HASH = "9a2d06b79512585602f3a6478257c63b14b19955e1eb909fc9115c9d065f35a4c0c4a0bda3c8568d5818759cd0f81c3bccdedaca63bd239a748ac676c0ac915a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
