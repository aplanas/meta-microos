SUMMARY = "Binary files of ptex2pdf"
DESCRIPTION = "Binary files of ptex2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29335"

RPM_NAME = "texlive-ptex2pdf-bin-2023.20230311.svn29335-93.2.aarch64.rpm"
RPM_HASH = "53c978abe8d56335c4be79d4df789275fc59409c13402f8f712022acf60584cdfeb652ccf0ef40c60531ccdef429fafee1002e8f283f83e9d100bee2d0daf15c"

RPROVIDES:${PN} += "texlive-ptex2pdf-bin"

RDEPENDS:${PN} += "texlive-ptex2pdf"

inherit rpm
