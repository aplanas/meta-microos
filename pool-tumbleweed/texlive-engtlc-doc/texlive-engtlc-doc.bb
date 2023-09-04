SUMMARY = "Documentation for texlive-engtlc"
DESCRIPTION = "This package includes the documentation for texlive-engtlc"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn28571"

RPM_NAME = "texlive-engtlc-doc-2023.209.3.2svn28571-54.2.noarch.rpm"
RPM_HASH = "b6c9d933e2d56686589881580555efdacac3ede1bc17caea3835b48b6566b379c93620af04421345b6b1c88fe0dedcf8ffec36d8f74067d534e217efc8bf606c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engtlc-doc-en;it \
texlive-engtlc-doc"

RDEPENDS:${PN} += ""

inherit rpm
