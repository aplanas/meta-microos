SUMMARY = "Documentation for texlive-transparent"
DESCRIPTION = "This package includes the documentation for texlive-transparent"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn64852"

RPM_NAME = "texlive-transparent-doc-2023.201.1.5svn64852-52.1.noarch.rpm"
RPM_HASH = "f3dd0ae5174e517fbdf075b5ddae4b8f37b7e00e44acee2f5ad780046b753a9b5f3325104d8b806d89267873bd27ca65807b5bb421d6f99912fb7975d7886b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-transparent-doc"
RDEPENDS:${PN} += ""

inherit rpm
