SUMMARY = "Documentation for texlive-trigonometry"
DESCRIPTION = "This package includes the documentation for texlive-trigonometry"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn43006"

RPM_NAME = "texlive-trigonometry-doc-2023.201.svn43006-52.1.noarch.rpm"
RPM_HASH = "695044187869c256b59b4fb3a387bd9bc5bb3babe6ea64a87c6a7fec14996ad7ed84fa7a6158ae004126c6ae7816529dd53cd3d9ea9dcaba688079678157bb2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trigonometry-doc"

RDEPENDS:${PN} += ""

inherit rpm
