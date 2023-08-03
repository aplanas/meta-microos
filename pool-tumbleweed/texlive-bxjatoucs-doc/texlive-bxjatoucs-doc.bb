SUMMARY = "Documentation for texlive-bxjatoucs"
DESCRIPTION = "This package includes the documentation for texlive-bxjatoucs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn52509"

RPM_NAME = "texlive-bxjatoucs-doc-2023.209.0.0.2svn52509-53.1.noarch.rpm"
RPM_HASH = "9217fd6542bbdd98e0aab67e0361c9e520349ee3a8dd916bb728a499c97cc639a021c63336c83a2bcdc602e945ffb7895ae8cc8ffadab8bb78e5524116789160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxjatoucs-doc"

RDEPENDS:${PN} += ""

inherit rpm
