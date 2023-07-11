SUMMARY = "Documentation for texlive-ieejtran"
DESCRIPTION = "This package includes the documentation for texlive-ieejtran"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.19svn65641"

RPM_NAME = "texlive-ieejtran-doc-2023.208.0.0.19svn65641-53.1.noarch.rpm"
RPM_HASH = "98dd37a0a60dda8891fe1d09387e67cb51a1aa992cf2d00533a6532fadb103e57dd527ca4d2741ec4b8d7d34e2f428c52489456f8c1b6f01aa837adbb5b9e2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ieejtran-doc-ja \
texlive-ieejtran-doc"

RDEPENDS:${PN} += ""

inherit rpm
