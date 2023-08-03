SUMMARY = "Documentation for texlive-csvsimple"
DESCRIPTION = "This package includes the documentation for texlive-csvsimple"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.2svn64450"

RPM_NAME = "texlive-csvsimple-doc-2023.209.2.3.2svn64450-55.1.noarch.rpm"
RPM_HASH = "5bf4dd8e2be10ec736b8a0dd73a6d2b3c75d3b1dac847ce8a1fe2da142e12fa4d5e8be37edaa258034c701d0d121bcf3d766bdef5d3593fe266f4aeb26f51f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csvsimple-doc"

RDEPENDS:${PN} += ""

inherit rpm
