SUMMARY = "Documentation for texlive-proflabo"
DESCRIPTION = "This package includes the documentation for texlive-proflabo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63147"

RPM_NAME = "texlive-proflabo-doc-2023.201.1.0svn63147-52.1.noarch.rpm"
RPM_HASH = "e38ac20b116b1948d7ac03ddfe83a4fd315c2c913642f45e326a830b7f8cf6833b3eff7bb9186210df605b3f4c908ad529bf058ed266723f122fe4c367d80160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proflabo-doc"

RDEPENDS:${PN} += ""

inherit rpm
