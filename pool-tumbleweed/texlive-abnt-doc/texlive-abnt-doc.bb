SUMMARY = "Documentation for texlive-abnt"
DESCRIPTION = "This package includes the documentation for texlive-abnt"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55471"

RPM_NAME = "texlive-abnt-doc-2023.201.svn55471-54.1.noarch.rpm"
RPM_HASH = "de7b65c88a9d8a52a9a030d0f89d14ec234950f0ca7b51bb7c563cea894840e447a43bb54b303ee28b7780c61337834298857e3cb0149115182371897fec3da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
