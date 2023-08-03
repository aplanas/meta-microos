SUMMARY = "Documentation for texlive-skak"
DESCRIPTION = "This package includes the documentation for texlive-skak"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.3svn61719"

RPM_NAME = "texlive-skak-doc-2023.209.1.5.3svn61719-58.1.noarch.rpm"
RPM_HASH = "39aef24d2c75b78fdc1a4f1bc179635551d21cd0547f292aab225da31a64c6f6373009ae77502ab31d34f965ad41f3247771b11246ec069e79000e16d8f1bb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skak-doc"

RDEPENDS:${PN} += ""

inherit rpm
