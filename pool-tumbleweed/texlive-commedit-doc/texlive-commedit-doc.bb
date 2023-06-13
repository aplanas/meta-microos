SUMMARY = "Documentation for texlive-commedit"
DESCRIPTION = "This package includes the documentation for texlive-commedit"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn50116"

RPM_NAME = "texlive-commedit-doc-2023.201.1.02svn50116-53.1.noarch.rpm"
RPM_HASH = "0d26490f199ed51fd3a1c975ff67a75bfdbfde5796699212d10eb33ffb7b152a4ec3665f8c80afe00edb541739445c2ab0c9f21329a8d18f7084415cc651b241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commedit-doc"

RDEPENDS:${PN} += ""

inherit rpm
