SUMMARY = "Documentation for texlive-drac"
DESCRIPTION = "This package includes the documentation for texlive-drac"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn15878"

RPM_NAME = "texlive-drac-doc-2023.201.1svn15878-52.1.noarch.rpm"
RPM_HASH = "d293453ca3048f091fc858ad84aa50bbc94f59b76edc760abc7c260249fed8e5c54793e0a683329f1b9c890a9cfd9cb72ce605b46d39e966613d31df4f6c596c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-drac-doc:fr;en) \
texlive-drac-doc"

RDEPENDS:${PN} += ""

inherit rpm
