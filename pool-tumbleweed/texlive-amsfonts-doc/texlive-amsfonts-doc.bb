SUMMARY = "Documentation for texlive-amsfonts"
DESCRIPTION = "This package includes the documentation for texlive-amsfonts"
LICENSE = "OFL-1.1"

PV = "2023.201.3.04svn61937"

RPM_NAME = "texlive-amsfonts-doc-2023.201.3.04svn61937-54.1.noarch.rpm"
RPM_HASH = "395e403d103fb29cc1ff9165e88baaf61acce6241305524ba9bcd0f8a0a668820ea82a4da32a2a52df1daf0cb5502b979d06b740f2fe8391888dda85d864670a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
