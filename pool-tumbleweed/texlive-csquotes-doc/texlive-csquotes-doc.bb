SUMMARY = "Documentation for texlive-csquotes"
DESCRIPTION = "This package includes the documentation for texlive-csquotes"
LICENSE = "LPPL-1.0"

PV = "2023.204.5.2nsvn64389"

RPM_NAME = "texlive-csquotes-doc-2023.204.5.2nsvn64389-54.1.noarch.rpm"
RPM_HASH = "1596583097ae92cbf0c1d08a4af925ee0b67f1775ba45e6c8316146d9c8ee396c3d4fb964ce9118b608fb0fbcbab3bc1bd1afb19e211eca081a99732a73dc358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csquotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
