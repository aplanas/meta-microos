SUMMARY = "Documentation for texlive-scrjrnl"
DESCRIPTION = "This package includes the documentation for texlive-scrjrnl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn27810"

RPM_NAME = "texlive-scrjrnl-doc-2023.209.0.0.1svn27810-54.1.noarch.rpm"
RPM_HASH = "dd2e2122a17c65b9680017e8c32a2af9ad91a9a6a4f31f8484fc6fc122f357c3ac43abb3e97a6aeb0320c766730b0c72ca72170faf50e05a549ec87666ba3e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrjrnl-doc"

RDEPENDS:${PN} += ""

inherit rpm
