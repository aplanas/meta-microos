SUMMARY = "Haskell yesod library documentation"
DESCRIPTION = "This package provides the Haskell yesod library documentation."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-doc-1.6.2.1-2.4.noarch.rpm"
RPM_HASH = "9f6d0a50879b7e75a5be092765a6beac5b468c7cb9d00b51a38aaa1e0cf63b5261c2b32b11152e1c5b774343039b0b94f4c4db81933f1c1bfecf7280421410e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
