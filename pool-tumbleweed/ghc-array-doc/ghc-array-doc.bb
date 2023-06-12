SUMMARY = "Haskell array library documentation"
DESCRIPTION = "This package provides the Haskell array library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-doc-0.5.4.0-3.1.noarch.rpm"
RPM_HASH = "ace76a6501d267a5c5b48ca1a5b4950d0ee050f3555dce6d1fcfe9d4c5f275dcb666dcec3f1444b918f67501cfd5fe5f3a5da12cd57e14166327001c3da90a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-array-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
