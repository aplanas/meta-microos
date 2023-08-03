SUMMARY = "Documentation for texlive-checkcites"
DESCRIPTION = "This package includes the documentation for texlive-checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn64155"

RPM_NAME = "texlive-checkcites-doc-2023.209.2.6svn64155-54.1.noarch.rpm"
RPM_HASH = "87e344b0e13fb863b86ce99b86b057592947fc50d8b4ffba1629c85d257a435985d122af0ecd4db3b502a5eaf12d1449f1080717ae4ce525c679c6632aba269b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkcites-doc"

RDEPENDS:${PN} += ""

inherit rpm
