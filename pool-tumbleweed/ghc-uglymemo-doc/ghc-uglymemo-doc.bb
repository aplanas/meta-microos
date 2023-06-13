SUMMARY = "Haskell uglymemo library documentation"
DESCRIPTION = "This package provides the Haskell uglymemo library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-doc-0.1.0.1-4.2.noarch.rpm"
RPM_HASH = "4585d93091d1a6cab8fc1e89bd7ba73ba715ec9b6b6c552fd53f2003ab40ee9eb0d75b213eb08ccd27b8c3542421c23087a26b86d1f7a5cde1700bafe6192953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uglymemo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
