SUMMARY = "Documentation for texlive-quran-ur"
DESCRIPTION = "This package includes the documentation for texlive-quran-ur"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-doc-2023.201.0.0.21svn57597-53.2.noarch.rpm"
RPM_HASH = "c5c69aa3cdac67079c3daf72149567144b78f0507c013d1ffbfc0ac3aa866eda1567a8cba40ef1b9644b7a14872acbcae2fbfa43b86019d1684dd8ad9b87038f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-ur-doc"

RDEPENDS:${PN} += ""

inherit rpm
