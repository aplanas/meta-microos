SUMMARY = "Documentation for texlive-rccol"
DESCRIPTION = "This package includes the documentation for texlive-rccol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn15878"

RPM_NAME = "texlive-rccol-doc-2023.209.1.2csvn15878-54.1.noarch.rpm"
RPM_HASH = "728b4f60938f626621d0619c894402cdad38533d640aa15eeeb966f74b13c4ed33116090d77ec3de4456aeee34ec6e68c3172ce9582f06632e10879bac0166e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rccol-doc"

RDEPENDS:${PN} += ""

inherit rpm
