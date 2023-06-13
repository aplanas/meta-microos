SUMMARY = "Haskell cryptohash-md5 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-doc-0.11.101.0-4.3.noarch.rpm"
RPM_HASH = "b27441cfa58d2ab58b0c0adc59c4e223c89b6324f39a05b5614fd51cc845d6e0c1823012f15219b0baedb5247191f5b732f4adaacc56f6e67c8174d98b14b616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-md5-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
