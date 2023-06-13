SUMMARY = "Documentation for texlive-refenums"
DESCRIPTION = "This package includes the documentation for texlive-refenums"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2svn44131"

RPM_NAME = "texlive-refenums-doc-2023.201.1.1.2svn44131-53.1.noarch.rpm"
RPM_HASH = "e32970b8457a0f7c6a1067021b9109654d3d196a75ee611d184c45dec53eaa8ba13063d9a72dc528a218f2fe65009347ebaef356f67d6516427e8ea5300d2fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refenums-doc"

RDEPENDS:${PN} += ""

inherit rpm
