SUMMARY = "Documentation for texlive-pstool"
DESCRIPTION = "This package includes the documentation for texlive-pstool"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn46393"

RPM_NAME = "texlive-pstool-doc-2023.209.1.5esvn46393-54.2.noarch.rpm"
RPM_HASH = "0310c12d6e044cdf83b8eeb1d2541f6b5c91568c0cf8dcbdbadb2a995314e4dd4392e0be60ef5a11d590998589cc9d763faeef6e8758952612894cfa262bb343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstool-doc"

RDEPENDS:${PN} += ""

inherit rpm
