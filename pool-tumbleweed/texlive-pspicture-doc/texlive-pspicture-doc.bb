SUMMARY = "Documentation for texlive-pspicture"
DESCRIPTION = "This package includes the documentation for texlive-pspicture"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pspicture-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "a7123d9b4cb166d5aeb5b111bf2f90ad090893039c0fb8c7aa399a0f5d92b0854193cd05b7fef65b3b5f3501f1fdb995c3d388dbbd46dd18adc7ea96716fd81a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pspicture-doc"
RDEPENDS:${PN} += ""

inherit rpm
