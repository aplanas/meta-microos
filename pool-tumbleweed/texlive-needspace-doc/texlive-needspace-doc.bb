SUMMARY = "Documentation for texlive-needspace"
DESCRIPTION = "This package includes the documentation for texlive-needspace"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3dsvn29601"

RPM_NAME = "texlive-needspace-doc-2023.209.1.3dsvn29601-55.1.noarch.rpm"
RPM_HASH = "c6a9a1b2d8ce535041bb80722fe5a0f19f34c22dbcc3b5b38217d1d097f8cca518eddf0dfd80a2a743d771b38a9a22bc74dcb67b6c45cf9e93dc738d2690998c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-needspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
