SUMMARY = "Binary files of attachfile2"
DESCRIPTION = "Binary files of attachfile2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52909"

RPM_NAME = "texlive-attachfile2-bin-2023.20230311.svn52909-91.1.aarch64.rpm"
RPM_HASH = "65a712ccd0806191a1da0f02d105ef23fba5e8c7e3ea53878ebc010716a794666d41caa67e20e4d40e905efd953182bff539ebcbd78a6c9a789eed913f112624"

RPROVIDES:${PN} += "texlive-attachfile2-bin \
texlive-attachfile2-bin(aarch-64) \
texlive-pdftools-bin:/usr/bin/pdfatfi"

RDEPENDS:${PN} += "texlive-attachfile2"

inherit rpm
