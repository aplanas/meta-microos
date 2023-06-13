SUMMARY = "Documentation for texlive-xltabular"
DESCRIPTION = "This package includes the documentation for texlive-xltabular"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2esvn56855"

RPM_NAME = "texlive-xltabular-doc-2023.201.0.0.2esvn56855-52.1.noarch.rpm"
RPM_HASH = "ca65f672cd5dc64f5fc0a2d2c33e32731d0739451db2049deaeb3a63da2934c4693327e00e9fb8ff3e3bb89fa7a7cc637039244022360534b530ba7f6cbd6508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xltabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
