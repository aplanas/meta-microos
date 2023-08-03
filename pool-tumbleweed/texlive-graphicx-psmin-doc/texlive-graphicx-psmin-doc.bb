SUMMARY = "Documentation for texlive-graphicx-psmin"
DESCRIPTION = "This package includes the documentation for texlive-graphicx-psmin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-doc-2023.209.1.2svn56931-54.1.noarch.rpm"
RPM_HASH = "174ed74a9655aceab31fe7ea93a3673113b03381a5d72198acf2869f718e29a0e8a919f4db7e7bd7e66fa7ae7dd045c304a158263f544a159c3d514adfe04250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicx-psmin-doc"

RDEPENDS:${PN} += ""

inherit rpm
