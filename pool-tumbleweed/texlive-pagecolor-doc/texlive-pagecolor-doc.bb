SUMMARY = "Documentation for texlive-pagecolor"
DESCRIPTION = "This package includes the documentation for texlive-pagecolor"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2bsvn65843"

RPM_NAME = "texlive-pagecolor-doc-2023.201.1.2bsvn65843-51.1.noarch.rpm"
RPM_HASH = "c960fa0778b986f60cc2bc52fba6450005a0445b9b9e156a72137eb2fabe663d03f40dd37676bf08af0f013ad16de1040c1b2d5bcba85805d43ee6a93fbd101b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagecolor-doc"
RDEPENDS:${PN} += ""

inherit rpm
