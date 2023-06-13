SUMMARY = "Documentation for texlive-msu-thesis"
DESCRIPTION = "This package includes the documentation for texlive-msu-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0bsvn65462"

RPM_NAME = "texlive-msu-thesis-doc-2023.201.4.0bsvn65462-54.1.noarch.rpm"
RPM_HASH = "26c50ab8885508da1b453f0691ddb4e1861895981ae23bd48422db40e617285d2fe6c9b1096627cd0b3102912da41157e1cfff149d9c8753ea87c955b0b0ddee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-msu-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
