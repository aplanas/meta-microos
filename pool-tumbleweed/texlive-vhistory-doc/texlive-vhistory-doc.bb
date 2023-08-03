SUMMARY = "Documentation for texlive-vhistory"
DESCRIPTION = "This package includes the documentation for texlive-vhistory"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.0svn61719"

RPM_NAME = "texlive-vhistory-doc-2023.209.1.8.0svn61719-54.1.noarch.rpm"
RPM_HASH = "40e43c8b30c5d1de8e3d1f9e06331549a0a2e83f1d97e3df7bb09c3585ffdd7c35458fbef69e19f467bda05be488902929b93b6ba16ddd7c7399051a36e1ec1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-vhistory-doc-de \
texlive-vhistory-doc"

RDEPENDS:${PN} += ""

inherit rpm
