SUMMARY = "Documentation for texlive-lps"
DESCRIPTION = "This package includes the documentation for texlive-lps"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn21322"

RPM_NAME = "texlive-lps-doc-2023.201.0.0.7svn21322-54.1.noarch.rpm"
RPM_HASH = "65e3bb017edf4545c45d22e7be2bc740e4ace6aee2d7933ccb34c4c1020ce950500fafcbef8052e2b8a47b4c0f931743234b28a462c10f66bf8f59edad875f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lps-doc"

RDEPENDS:${PN} += ""

inherit rpm
