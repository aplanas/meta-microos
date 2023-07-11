SUMMARY = "Binary files of pst2pdf"
DESCRIPTION = "Binary files of pst2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29333"

RPM_NAME = "texlive-pst2pdf-bin-2023.20230311.svn29333-92.1.aarch64.rpm"
RPM_HASH = "f5cf3396b162e6384e39e1cc4f4bef32e3e78b3e77bce8da9a0f44546433189d3e941f51a090d8521ed68ab88c67d81be0ae54d544e04333307f21baf7b44651"

RPROVIDES:${PN} += "texlive-pst2pdf-bin"

RDEPENDS:${PN} += "texlive-pst2pdf"

inherit rpm
