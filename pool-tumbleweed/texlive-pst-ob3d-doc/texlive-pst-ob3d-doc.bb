SUMMARY = "Documentation for texlive-pst-ob3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-ob3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.22svn54514"

RPM_NAME = "texlive-pst-ob3d-doc-2023.209.0.0.22svn54514-53.1.noarch.rpm"
RPM_HASH = "9f75c310efc05f9baba96f6cf8f1596bf6a2e5b3c20e6cc248ddee0f4f7efd9c4da1e301b0f4714667e31027e8bf75f84b20be757e2ac54a20c83fe1187b5dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ob3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
