SUMMARY = "Documentation for texlive-linegoal"
DESCRIPTION = "This package includes the documentation for texlive-linegoal"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn21523"

RPM_NAME = "texlive-linegoal-doc-2023.209.2.9svn21523-55.1.noarch.rpm"
RPM_HASH = "fc6b31bbc2ca2f17d762cb666aa99d649e3cd38736b8c2ca6ce9e586da58c41f7d32207164064f77f07ea65f31cb5517bc38b1f83d8d45832f42461023df4b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linegoal-doc"

RDEPENDS:${PN} += ""

inherit rpm
