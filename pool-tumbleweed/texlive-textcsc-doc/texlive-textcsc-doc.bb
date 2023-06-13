SUMMARY = "Documentation for texlive-textcsc"
DESCRIPTION = "This package includes the documentation for texlive-textcsc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64935"

RPM_NAME = "texlive-textcsc-doc-2023.201.1.0.1svn64935-54.1.noarch.rpm"
RPM_HASH = "3359bee64ff933bd714c7192b58c8f82942d60c630c3d0388ec09376eae34db514f778642136270f8717fc8daa1fcc5b155d5d9dd4dcd303b541b41fbc215fef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textcsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
