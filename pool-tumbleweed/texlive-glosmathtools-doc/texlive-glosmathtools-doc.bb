SUMMARY = "Documentation for texlive-glosmathtools"
DESCRIPTION = "This package includes the documentation for texlive-glosmathtools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-doc-2023.201.1.0.0svn55920-53.1.noarch.rpm"
RPM_HASH = "10a0d5d700df2627e72fd931c251d28360347484cb95954b6654170352735e40359974b08f5f98b98b707d832ce022b56f8fddcce7d1ad6176ae5bd82119c326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-glosmathtools-doc:fr) \
texlive-glosmathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
