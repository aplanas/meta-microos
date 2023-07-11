SUMMARY = "Documentation for texlive-xechangebar"
DESCRIPTION = "This package includes the documentation for texlive-xechangebar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-xechangebar-doc-2023.201.1.0svn54080-52.2.noarch.rpm"
RPM_HASH = "6e069b30259d1873656361ea9a21a008da1d648e848325b8fa6bf6c79246de57d1b658240ceeae9741e352578dcd70d0463839e9123a0c69bc07f7cb1cc580ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xechangebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
