SUMMARY = "Documentation for texlive-customdice"
DESCRIPTION = "This package includes the documentation for texlive-customdice"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64089"

RPM_NAME = "texlive-customdice-doc-2023.209.1.1svn64089-55.1.noarch.rpm"
RPM_HASH = "a38734b687ed08b37f3cf8bf00b7707a9e4affaea4313058af58ecc136b6e816dc96503580db8862805267c719fbcbc79c81a58d4048d1554ee75e9e51704c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-customdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
