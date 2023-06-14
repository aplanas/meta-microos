SUMMARY = "Documentation for texlive-pxchfon"
DESCRIPTION = "This package includes the documentation for texlive-pxchfon"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9asvn66064"

RPM_NAME = "texlive-pxchfon-doc-2023.201.1.9asvn66064-53.1.noarch.rpm"
RPM_HASH = "771db211e04ddea549f826d78e18441764d292dd0c0c33b3c012d05a899778983b726793b1fa8da7b7206feea4ddb1e3b0f1aa9eadf920bb9a69cfd077beab8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxchfon-doc-ja \
texlive-pxchfon-doc"

RDEPENDS:${PN} += ""

inherit rpm
