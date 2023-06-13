SUMMARY = "Haskell bencode library documentation"
DESCRIPTION = "This package provides the Haskell bencode library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-doc-0.6.1.1-4.3.noarch.rpm"
RPM_HASH = "6f124fa2e4b59d2bc1dc2fe55a06aab2bd5f22044b381fb78b05786c39d200d6f1b84785e37e70031947208539cf58a84e748f71e4cc70abf2729e2a077102f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bencode-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
