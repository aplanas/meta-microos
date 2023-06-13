SUMMARY = "Documentation for texlive-exam-lite"
DESCRIPTION = "This package includes the documentation for texlive-exam-lite"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65754"

RPM_NAME = "texlive-exam-lite-doc-2023.201.svn65754-52.1.noarch.rpm"
RPM_HASH = "ee6293e46c83ffa86b853c8e33d7384e0193f41be02c2ed8abebaf7209fb24d57462f7e32391d2c75a278ff40d97b09c2a927cef1f2507f3e10d39fcaf9724f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exam-lite-doc"

RDEPENDS:${PN} += ""

inherit rpm
