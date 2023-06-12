SUMMARY = "Documentation for texlive-letterswitharrows"
DESCRIPTION = "This package includes the documentation for texlive-letterswitharrows"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59993"

RPM_NAME = "texlive-letterswitharrows-doc-2023.201.svn59993-54.1.noarch.rpm"
RPM_HASH = "58e1b0cae58b1ba74f5dabcfc29629f6c136aa9eefabc65501d6e7b04550a3eb5ad383530376867b57828c4f1fc5abf596d26439d93eb5dd78ebcd212d023a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-letterswitharrows-doc"
RDEPENDS:${PN} += ""

inherit rpm
