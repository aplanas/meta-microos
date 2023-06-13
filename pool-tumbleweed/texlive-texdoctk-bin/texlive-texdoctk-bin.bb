SUMMARY = "Binary files of texdoctk"
DESCRIPTION = "Binary files of texdoctk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29741"

RPM_NAME = "texlive-texdoctk-bin-2023.20230311.svn29741-91.1.aarch64.rpm"
RPM_HASH = "622872174b3582e799d9f922ed74249d181bf2d167415d52a5954af1a4a7701c2e3681368bbc3cc56241b52a5c9547e02a06efb237ff4ab1709cee23c1ac3980"

RPROVIDES:${PN} += "texlive-texdoctk-bin \
texlive-texdoctk-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texdoctk"

inherit rpm
