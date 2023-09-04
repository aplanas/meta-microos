SUMMARY = "Haskell dbus library documentation"
DESCRIPTION = "This package provides the Haskell dbus library documentation."
LICENSE = "Apache-2.0"

PV = "1.2.29"

RPM_NAME = "ghc-dbus-doc-1.2.29-1.7.noarch.rpm"
RPM_HASH = "7348bfc03cde79b02deedda246fb652cb763309800a2d53617d22ab6519bf17d06183cb190b3b6e05beb27f44efdb23d6750e2c2675d8502adf7fa73c61ae432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dbus-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
