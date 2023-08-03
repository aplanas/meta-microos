SUMMARY = "Documentation for texlive-limap"
DESCRIPTION = "This package includes the documentation for texlive-limap"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn44863"

RPM_NAME = "texlive-limap-doc-2023.209.2.2svn44863-55.1.noarch.rpm"
RPM_HASH = "ff79d16fd6ca60588a8534cfda4ef28f05e643d34f3d103e0cae995ddb67256101bf6356ffc23f14178f443e88dfd294d501526052438715418cdbad2861dc8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-limap-doc"

RDEPENDS:${PN} += ""

inherit rpm
