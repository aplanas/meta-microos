SUMMARY = "Haskell temporary library documentation"
DESCRIPTION = "This package provides the Haskell temporary library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-doc-1.3-6.2.noarch.rpm"
RPM_HASH = "47ed84c0bcfa447911af2be6b15d2832ec4b78c763bff4b6d183f9e1388966ee206e6364e0d035e9a828e9ceaf932bd6021f99dee310984c229ea1b736e695b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-temporary-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
