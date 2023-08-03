SUMMARY = "Documentation for texlive-quran-de"
DESCRIPTION = "This package includes the documentation for texlive-quran-de"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-doc-2023.209.0.0.2svn54191-54.1.noarch.rpm"
RPM_HASH = "d2b4663d29047dfb0b1626ccfc7f3c59a6a9f6615430fbc3f747616594201b3c3609e243dfe029df4ff7e7f3215c5df6d108be26456beb417cb892244924ff06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-de-doc"

RDEPENDS:${PN} += ""

inherit rpm
