SUMMARY = "Documentation for texlive-ijmart"
DESCRIPTION = "This package includes the documentation for texlive-ijmart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn30958"

RPM_NAME = "texlive-ijmart-doc-2023.201.1.7svn30958-52.1.noarch.rpm"
RPM_HASH = "245b09b31b7f99c6dd263ae24ee4b161541f62de69211d7d0a7f8aa310af52269ed73474daf3d5942b9300a4b39ff9d7afccb74c456fafaf1dfd1bb745443d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijmart-doc"
RDEPENDS:${PN} += ""

inherit rpm
