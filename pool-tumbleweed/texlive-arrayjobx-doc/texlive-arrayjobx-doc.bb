SUMMARY = "Documentation for texlive-arrayjobx"
DESCRIPTION = "This package includes the documentation for texlive-arrayjobx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn18125"

RPM_NAME = "texlive-arrayjobx-doc-2023.209.1.04svn18125-54.1.noarch.rpm"
RPM_HASH = "85e7f5d91040abc801f7c5afdc755b1a6848b8f5cab288acbaae67134b71c6f23e32ce61f76a40e74569e43ef049584bfe49e764d14dfc8d35f33c6d676d433f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arrayjobx-doc"

RDEPENDS:${PN} += ""

inherit rpm
