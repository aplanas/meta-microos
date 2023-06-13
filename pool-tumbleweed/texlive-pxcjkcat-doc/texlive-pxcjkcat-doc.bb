SUMMARY = "Documentation for texlive-pxcjkcat"
DESCRIPTION = "This package includes the documentation for texlive-pxcjkcat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-doc-2023.201.1.4svn63967-53.1.noarch.rpm"
RPM_HASH = "3804f05a56e92f9486c2f1111b368fc81becca59c72f357476aa99ff1b456e55f9e5700de657bb7367c0ecd4ba71e4cfd44ef6256d365b009c4cafa53ff5f3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pxcjkcat-doc:ja;en) \
texlive-pxcjkcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
