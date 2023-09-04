SUMMARY = "Documentation for texlive-esieecv"
DESCRIPTION = "This package includes the documentation for texlive-esieecv"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59638"

RPM_NAME = "texlive-esieecv-doc-2023.209.svn59638-54.2.noarch.rpm"
RPM_HASH = "20d211efb616183a9c58c39c0f7af2dc6521da468384e79b057568d8e11644bee711053b9f3e3b7e8ea9abfde6c64751c347acf6a114514f4873449a37079212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esieecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
