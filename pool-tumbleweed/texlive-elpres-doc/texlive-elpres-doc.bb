SUMMARY = "Documentation for texlive-elpres"
DESCRIPTION = "This package includes the documentation for texlive-elpres"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn60209"

RPM_NAME = "texlive-elpres-doc-2023.209.1.0.1svn60209-54.2.noarch.rpm"
RPM_HASH = "a222e876f30650c53496cdfbdfbbd1d64618b97c60a3410aba8d97b6db39e4aa3ab9860f3d02bba838f8dd3cb8b9550bb1f3364eb96396ad642e112d97eb490c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elpres-doc"

RDEPENDS:${PN} += ""

inherit rpm
