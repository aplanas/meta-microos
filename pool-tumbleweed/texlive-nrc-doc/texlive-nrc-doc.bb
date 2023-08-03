SUMMARY = "Documentation for texlive-nrc"
DESCRIPTION = "This package includes the documentation for texlive-nrc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01asvn29027"

RPM_NAME = "texlive-nrc-doc-2023.209.2.01asvn29027-55.1.noarch.rpm"
RPM_HASH = "a4f5c1d01744b6bf4fb4dc303df72396327b42ad3c311822a89272bcb853d8d82559c43dfe4005d2b6fb414e4d812ae80bee8852c46e0bf3387bf087bd797053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nrc-doc"

RDEPENDS:${PN} += ""

inherit rpm
