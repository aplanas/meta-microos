SUMMARY = "Documentation for texlive-bbding"
DESCRIPTION = "This package includes the documentation for texlive-bbding"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn17186"

RPM_NAME = "texlive-bbding-doc-2023.209.1.01svn17186-54.1.noarch.rpm"
RPM_HASH = "6d870fceb537b9de1ef581d34e8ee1b45023ab1e62bc7b3b8af6a64cd1e35d989fb5a6156b83e5496c245046a3959f4a432cb4cac7f3b8ca67ad3de13bad98db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbding-doc"

RDEPENDS:${PN} += ""

inherit rpm
