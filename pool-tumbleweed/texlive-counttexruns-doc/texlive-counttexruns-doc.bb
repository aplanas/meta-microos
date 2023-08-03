SUMMARY = "Documentation for texlive-counttexruns"
DESCRIPTION = "This package includes the documentation for texlive-counttexruns"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00asvn27576"

RPM_NAME = "texlive-counttexruns-doc-2023.209.1.00asvn27576-55.1.noarch.rpm"
RPM_HASH = "627ca484dca452df1b8d418752bb29fbaa80cda876f04ec3126fe79aad268341ba1754035b58ca0862b292a7cfd8437b4abd13e80c9db626d5d3583ec8461acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-counttexruns-doc"

RDEPENDS:${PN} += ""

inherit rpm
