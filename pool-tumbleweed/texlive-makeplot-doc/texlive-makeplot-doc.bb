SUMMARY = "Documentation for texlive-makeplot"
DESCRIPTION = "This package includes the documentation for texlive-makeplot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.6svn15878"

RPM_NAME = "texlive-makeplot-doc-2023.201.1.0.6svn15878-52.1.noarch.rpm"
RPM_HASH = "117af9cb937a0c136b761548ce351c36e45be9b4b405172f4ec600a915e5ebe77bb2ff82c9caf8c7f1c905d3ed8b3668c23ccab710fcb43b09c7629ae0a3beea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
