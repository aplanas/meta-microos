SUMMARY = "Documentation for texlive-fundus-sueterlin"
DESCRIPTION = "This package includes the documentation for texlive-fundus-sueterlin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn26030"

RPM_NAME = "texlive-fundus-sueterlin-doc-2023.209.1.2svn26030-53.1.noarch.rpm"
RPM_HASH = "1b3a2038e0e6bb9cd45c5d7e31f291fd11a749081f0f1431200eb74017dae3e1990a36b313a3d723776f7bda242cd552688bd45a4832469ac2608cd002108d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fundus-sueterlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
