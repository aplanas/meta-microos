SUMMARY = "Documentation for texlive-droid"
DESCRIPTION = "This package includes the documentation for texlive-droid"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn54512"

RPM_NAME = "texlive-droid-doc-2023.209.3.2svn54512-53.1.noarch.rpm"
RPM_HASH = "9ceb5ad5a4b893189b4c76d8e2fe52edefffff7b64ff022195ab9495c41ce6023fcba1bc028bf9c69a3d1e85216621c3fa1199319eeb5dda93a96166d4d25505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-droid-doc"

RDEPENDS:${PN} += ""

inherit rpm
