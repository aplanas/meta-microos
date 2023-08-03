SUMMARY = "Documentation for texlive-dpfloat"
DESCRIPTION = "This package includes the documentation for texlive-dpfloat"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17196"

RPM_NAME = "texlive-dpfloat-doc-2023.209.svn17196-53.1.noarch.rpm"
RPM_HASH = "8bee3b546373cc2180d00396a039044945fbb734128296373bf2b7f56db313db07a35d87e1d9ecaa8c264de51775b6a990702c29f0754996094cc2edb8ce948c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dpfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
