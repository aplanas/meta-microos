SUMMARY = "Documentation for texlive-siunitx"
DESCRIPTION = "This package includes the documentation for texlive-siunitx"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.2svn66365"

RPM_NAME = "texlive-siunitx-doc-2023.209.3.2.2svn66365-58.1.noarch.rpm"
RPM_HASH = "9bd3c19fd7540a4885de85a55e17a70c3302181a03dcb9cc4e931f187aee6aaeb01e2fbcd9ea34d29067c2eccfc963029cc1bd012f80b138b75ad9d5174fbace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-siunitx-doc"

RDEPENDS:${PN} += ""

inherit rpm
