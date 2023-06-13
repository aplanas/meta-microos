SUMMARY = "Documentation for texlive-maker"
DESCRIPTION = "This package includes the documentation for texlive-maker"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44823"

RPM_NAME = "texlive-maker-doc-2023.201.1.0svn44823-52.1.noarch.rpm"
RPM_HASH = "31a4b8724b477661bfb58205df7a9181c6a6dd65c60742ad8e5a1e72e1d5c4171190475eabfe98dfbcf11894e2b093c2854960248371239c4f0141aa548e37dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maker-doc"

RDEPENDS:${PN} += ""

inherit rpm
