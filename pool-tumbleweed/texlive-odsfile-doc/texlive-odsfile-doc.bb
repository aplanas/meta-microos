SUMMARY = "Documentation for texlive-odsfile"
DESCRIPTION = "This package includes the documentation for texlive-odsfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn65268"

RPM_NAME = "texlive-odsfile-doc-2023.209.0.0.7svn65268-55.1.noarch.rpm"
RPM_HASH = "67f281d6b1f603f4821ca5cc9b3c018b9a86c75461e54c43b3787bfb8fc9c7711da651d6cb965200627431cff0187e9d74fb7d2eedd5e26ceb8a00609d222be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-odsfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
