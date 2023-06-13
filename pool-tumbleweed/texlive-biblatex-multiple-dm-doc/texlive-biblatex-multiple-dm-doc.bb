SUMMARY = "Documentation for texlive-biblatex-multiple-dm"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-multiple-dm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn37081"

RPM_NAME = "texlive-biblatex-multiple-dm-doc-2023.201.1.0.1svn37081-53.1.noarch.rpm"
RPM_HASH = "1f406b2c7fffdbd0a62cd10d515bc7a41665111d8dc7f5ef937d223e254d8ab84f2b7c9b1360655398fe20b3512c236ae81bdd5fe13535b621d2c02f6ff1b86c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-multiple-dm-doc"

RDEPENDS:${PN} += ""

inherit rpm
