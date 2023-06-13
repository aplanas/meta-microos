SUMMARY = "Haskell cryptohash-sha1 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-doc-0.11.101.0-4.3.noarch.rpm"
RPM_HASH = "3623498689c5aa2aa63578aaa3e0b7ad20bc0118a9e3677cf4450de447430434620e132f7bb563cf10139b7d8593389409778e5d2344a8ad3e9492b884434a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
