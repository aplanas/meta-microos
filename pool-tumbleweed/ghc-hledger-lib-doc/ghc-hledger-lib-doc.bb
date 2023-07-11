SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-doc-1.28-2.7.noarch.rpm"
RPM_HASH = "ed21b51a7816e9354452747a888d56cdb73cbf1b8e72b7259f9bacc1cf5c0974a6046731c94df21325421c617747494af2da99ee61aeb7b0b485a748d8d7b78d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
