SUMMARY = "Documentation for texlive-savetrees"
DESCRIPTION = "This package includes the documentation for texlive-savetrees"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn40525"

RPM_NAME = "texlive-savetrees-doc-2023.201.2.4svn40525-53.1.noarch.rpm"
RPM_HASH = "4b3f33fe5b514d0904195eb4be31687726c9edc394e8f3b5ff0da447dd28cb35e452f1eeb4a12b5713381aea3b6f7795ff11a4a217c39405940157be4a33c624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-savetrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
