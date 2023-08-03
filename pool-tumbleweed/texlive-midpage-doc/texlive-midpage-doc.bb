SUMMARY = "Documentation for texlive-midpage"
DESCRIPTION = "This package includes the documentation for texlive-midpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn17484"

RPM_NAME = "texlive-midpage-doc-2023.209.1.1asvn17484-55.1.noarch.rpm"
RPM_HASH = "9973a34e3fa32678686bf3058e6efadcfca8bb665d775f7919ba36b9b38dd1b0f5d8b2bf18335ab0a67e1b30db76a339bbb397573d4942177532a128fdb3a76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-midpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
