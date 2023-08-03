SUMMARY = "Documentation for texlive-vcell"
DESCRIPTION = "This package includes the documentation for texlive-vcell"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn59039"

RPM_NAME = "texlive-vcell-doc-2023.209.1.0.2svn59039-54.1.noarch.rpm"
RPM_HASH = "80c2fe4685f81267612a94a01e51ca9da008ecd15b6ba64afb411eba322dfd44b05ba624e2061224bedac4e7720ff6799eb68decddf8506127e549d1367ea82f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vcell-doc"

RDEPENDS:${PN} += ""

inherit rpm
