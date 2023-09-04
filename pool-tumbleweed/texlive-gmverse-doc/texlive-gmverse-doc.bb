SUMMARY = "Documentation for texlive-gmverse"
DESCRIPTION = "This package includes the documentation for texlive-gmverse"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-doc-2023.209.0.0.73svn29803-54.2.noarch.rpm"
RPM_HASH = "91081ec65338cbfbd0cd0c2196248d7253e8d3199045bc60a1b2239c84a218057013fe6df10b53f3226b202faefd726fc610f9e12089710c3681743919b2374b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverse-doc"

RDEPENDS:${PN} += ""

inherit rpm
