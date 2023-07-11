SUMMARY = "Documentation for texlive-greek-inputenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-inputenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-doc-2023.201.1.8.2svn66296-53.2.noarch.rpm"
RPM_HASH = "d867ea19cda41eaa0e85f1fba86891f820cf6b878fdd34efce78d4978414bdd440ed27ce7ff7d562c99ed1daaaeefd045a6d5ce5389088ef04932a2ff40608cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-inputenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
