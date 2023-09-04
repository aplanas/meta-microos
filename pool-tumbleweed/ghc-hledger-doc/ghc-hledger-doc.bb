SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-doc-1.28-3.8.noarch.rpm"
RPM_HASH = "6c18679da22303d5a8a37c5194febbc4f3fb08398d1aa8da0352e52ee30a5f9b0cedf1ecb1a22fe111a4ff9ff4a44618e896db0c538b50d951861bd990377dc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
