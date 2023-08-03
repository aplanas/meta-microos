SUMMARY = "Documentation for texlive-totalcount"
DESCRIPTION = "This package includes the documentation for texlive-totalcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn56214"

RPM_NAME = "texlive-totalcount-doc-2023.209.1.0asvn56214-53.1.noarch.rpm"
RPM_HASH = "19921165c34c2580d58e0172f2dc46aa7b20f3cb8c86c02b9bfacc99d139bfdd26f4c18880d956e28527bbdf8233ff5cc341c1b135933d9da2a9ac719ff38f2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-totalcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
