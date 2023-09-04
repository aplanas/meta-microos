SUMMARY = "Haskell fdo-notify library documentation"
DESCRIPTION = "This package provides the Haskell fdo-notify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-doc-0.3.1-4.9.noarch.rpm"
RPM_HASH = "54e0629b78e21602ebafb36c4bc6eed9f9a92dc91bacdabddcb82a2dc92c6e5aa951ce14683e4b13453dcdf29100a15da0de05509c07008933a291d16aad55df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fdo-notify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
