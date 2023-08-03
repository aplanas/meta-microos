SUMMARY = "Documentation for texlive-gillcm"
DESCRIPTION = "This package includes the documentation for texlive-gillcm"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.1svn19878"

RPM_NAME = "texlive-gillcm-doc-2023.209.1.1svn19878-53.1.noarch.rpm"
RPM_HASH = "06925ea6255de0c89af32a16b5018eb714f09bf1b14770ec4ac4daf341c7c415aacf6b00a4f7c7bbd88d787a58e4ac64c9cafd9164e566400a4f2f371ba8fece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gillcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
