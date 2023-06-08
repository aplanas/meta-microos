SUMMARY = "Haskell attoparsec-iso8601 library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-doc-1.1.0.0-2.2.noarch.rpm"
RPM_HASH = "2c114165af8631c1176c94e908afe4326bfb74c975d8426b445718d0c917c9e2bf2689d4569229ba7bce131845fda36b38b393f6f7acbf5be887a239a5921c54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
