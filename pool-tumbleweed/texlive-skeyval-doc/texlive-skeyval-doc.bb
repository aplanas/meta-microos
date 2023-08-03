SUMMARY = "Documentation for texlive-skeyval"
DESCRIPTION = "This package includes the documentation for texlive-skeyval"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn30560"

RPM_NAME = "texlive-skeyval-doc-2023.209.1.3svn30560-58.1.noarch.rpm"
RPM_HASH = "3241c1746a6429a2cb3faf85bd681e05f52c9955e352741ccc90f8b105d7c1e1672c5392b92b8d756d065f7c32dc4f9043c62f8fc67c6a6c513e2dd883188a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeyval-doc"

RDEPENDS:${PN} += ""

inherit rpm
