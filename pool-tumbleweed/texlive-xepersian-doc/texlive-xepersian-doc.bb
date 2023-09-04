SUMMARY = "Documentation for texlive-xepersian"
DESCRIPTION = "This package includes the documentation for texlive-xepersian"
LICENSE = "LPPL-1.0"

PV = "2023.209.24.8svn64872"

RPM_NAME = "texlive-xepersian-doc-2023.209.24.8svn64872-53.2.noarch.rpm"
RPM_HASH = "3964d655942cd712e62fdcb87419b4e7a9f1822b09ee430cc83406693141942403a0e51e09ffca7e59985da3500f43a6211db33a0a1179aca5cd4ad4d3a08698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xepersian-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
