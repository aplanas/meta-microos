SUMMARY = "Binary files of pdfbook2"
DESCRIPTION = "Binary files of pdfbook2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37537"

RPM_NAME = "texlive-pdfbook2-bin-2023.20230311.svn37537-93.1.aarch64.rpm"
RPM_HASH = "998fe93072283ec9104e506e01816c3f608d5b59388060c07bd2d6326364c5e4c616948b1ec507d9325303192d62d1efb543df1f3228e653eb89e15ca51b228e"

RPROVIDES:${PN} += "texlive-pdfbook2-bin"

RDEPENDS:${PN} += "texlive-pdfbook2"

inherit rpm
