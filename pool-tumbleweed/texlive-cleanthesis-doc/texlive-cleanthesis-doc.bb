SUMMARY = "Documentation for texlive-cleanthesis"
DESCRIPTION = "This package includes the documentation for texlive-cleanthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn51472"

RPM_NAME = "texlive-cleanthesis-doc-2023.209.0.0.4.0svn51472-54.1.noarch.rpm"
RPM_HASH = "7b42b858804b1647d0b87669a4c82028bac85fa63dcc60606519c59ef8b5fff06c6d8b9567f1b1cb73feb6e9fd85265557ee29d290cfefb05ee498b50b28650f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleanthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
