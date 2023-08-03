SUMMARY = "Documentation for texlive-harvard"
DESCRIPTION = "This package includes the documentation for texlive-harvard"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.5svn15878"

RPM_NAME = "texlive-harvard-doc-2023.209.2.0.5svn15878-54.1.noarch.rpm"
RPM_HASH = "bdd0387bfa6d9dac460475c899eb033f25ec56ce093fcaf44cd29bb118f5abf6b15832ba5dbe0c93e1a4438a3c859cb3b27db9a3d0c791e629485aeb6df76609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvard-doc"

RDEPENDS:${PN} += ""

inherit rpm
