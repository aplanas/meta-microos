SUMMARY = "Haskell uglymemo library documentation"
DESCRIPTION = "This package provides the Haskell uglymemo library documentation."
LICENSE = "SUSE-Public-Domain"

PV = "0.1.0.1"

RPM_NAME = "ghc-uglymemo-doc-0.1.0.1-4.3.noarch.rpm"
RPM_HASH = "f1aa7206182f517b2fbc5ea00d19e1bdb3b47f5f43a429e5df37a9c6a0a0b1a3747b38ff08bfcce735535378ac4190397dfabbcc67dfca17aa1c6fbafb87d2ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uglymemo-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
