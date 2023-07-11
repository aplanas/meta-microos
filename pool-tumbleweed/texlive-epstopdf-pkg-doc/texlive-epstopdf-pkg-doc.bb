SUMMARY = "Documentation for texlive-epstopdf-pkg"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-doc-2023.201.2.11svn53546-53.2.noarch.rpm"
RPM_HASH = "6ab833d3366ed02916b04256e55b5412362a60a238a8b65cd15b1ef88bf4b5e460c0d616b4c91e4fccafcc7ee7fa6962f1609572a48f88452e5f23eea992c3d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
