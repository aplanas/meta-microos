SUMMARY = "Documentation for texlive-pst-2dplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-2dplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-pst-2dplot-doc-2023.209.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "329cd10ebec8a82aaeeb184563ef9c1151455a68dba5b72c7ecd323d9102ba4c22584fb90336f3d6f465f9de4a52567b3fa871a2f66c67c4d489d36b70d73e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-2dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
