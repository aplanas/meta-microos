SUMMARY = "Haskell cryptohash-sha256 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-doc-0.11.102.1-3.6.noarch.rpm"
RPM_HASH = "f7585929216c29e75b533ae582631360ae03c2ea2171bb35f57107b75d2c65305cade830d53c4dcc4cc4c13252e964038aa1726905a60d75790e1891021bde7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
