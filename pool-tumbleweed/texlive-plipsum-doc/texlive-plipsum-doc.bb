SUMMARY = "Documentation for texlive-plipsum"
DESCRIPTION = "This package includes the documentation for texlive-plipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.3svn30353"

RPM_NAME = "texlive-plipsum-doc-2023.209.4.3svn30353-53.1.noarch.rpm"
RPM_HASH = "3892113398d0ef36c86d064c795157ecca12155180fc1eb44c8018153a86fdf9be498e24a6838f203e838d9aa2aa792f90e441f893747966077849ba3e45dce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
