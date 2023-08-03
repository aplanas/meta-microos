SUMMARY = "Documentation for texlive-menukeys"
DESCRIPTION = "This package includes the documentation for texlive-menukeys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.2svn64314"

RPM_NAME = "texlive-menukeys-doc-2023.209.1.6.2svn64314-55.1.noarch.rpm"
RPM_HASH = "25519d454ba727364d4d0dcde9ee9237f1a4a015641aecedbe69e525a21b6cbb2e4a7acc180c60452babaf5b821b8f78f4af42631c97f2f9302d8d30ce4433a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-menukeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
