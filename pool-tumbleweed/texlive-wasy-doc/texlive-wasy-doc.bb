SUMMARY = "Documentation for texlive-wasy"
DESCRIPTION = "This package includes the documentation for texlive-wasy"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.5svn53533"

RPM_NAME = "texlive-wasy-doc-2023.201.2.5svn53533-53.1.noarch.rpm"
RPM_HASH = "5514cf137fa997cef47385f8f24c4ae3ee183d88170208eb3fe66faa971afc4d2d6f29c9250a2082bd866615df2738355ae859e476779c531a1a40195c6c3839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasy-doc"

RDEPENDS:${PN} += ""

inherit rpm
