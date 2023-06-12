SUMMARY = "Documentation for texlive-unicode-alphabets"
DESCRIPTION = "This package includes the documentation for texlive-unicode-alphabets"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66225"

RPM_NAME = "texlive-unicode-alphabets-doc-2023.201.svn66225-53.1.noarch.rpm"
RPM_HASH = "40bc3bb02cc96e6ca046406c8f55b10cf1c1760ddff9d4308b4b7baf60c7640104cbb4269013df3d1a314940104ea84a85a7125324d30574b14d452d67330117"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unicode-alphabets-doc"
RDEPENDS:${PN} += ""

inherit rpm
