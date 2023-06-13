SUMMARY = "Documentation for texlive-diffcoeff"
DESCRIPTION = "This package includes the documentation for texlive-diffcoeff"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.2svn65676"

RPM_NAME = "texlive-diffcoeff-doc-2023.201.5.2svn65676-52.1.noarch.rpm"
RPM_HASH = "edfc3e47ed2ff0f74efbd65ea290b4609036fd4a5de19c5395690a3dc7dce72da8d7f7a1996a4a0484aa4bc58b81546a4172640f1c4bfa8c2a4a54a51efe5078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diffcoeff-doc"

RDEPENDS:${PN} += ""

inherit rpm
