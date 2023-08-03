SUMMARY = "Documentation for texlive-piechartmp"
DESCRIPTION = "This package includes the documentation for texlive-piechartmp"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn19440"

RPM_NAME = "texlive-piechartmp-doc-2023.209.0.0.3.0svn19440-52.1.noarch.rpm"
RPM_HASH = "a774ca898c9b4c3a5ea8402e8f5d63731f6755b0426c5b08771d0b8f498d564f168ec1230951ef4dae3d5b4ac43c6c7b77e394283d4f9f67682ee7cf93ce69a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piechartmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
