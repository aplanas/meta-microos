SUMMARY = "Documentation for texlive-quotmark"
DESCRIPTION = "This package includes the documentation for texlive-quotmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-quotmark-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "3ee4d4a53c682cd236d8f95708a63bdb6add9be14b0be8316881d6d7ed1d93a432962f567da1b0c413e39d86354e2e19bd29ab7ed3a9bd74395ae5e4faadc7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
