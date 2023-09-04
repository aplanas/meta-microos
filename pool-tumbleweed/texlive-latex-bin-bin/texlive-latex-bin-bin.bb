SUMMARY = "Binary files of latex-bin"
DESCRIPTION = "Binary files of latex-bin"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54358"

RPM_NAME = "texlive-latex-bin-bin-2023.20230311.svn54358-93.2.aarch64.rpm"
RPM_HASH = "3656d4ff4ba9fa5d77bfa25a45a0bde10e7dc23036d52f8e1989df0b90bcb97549e196116ae17ca073e4463a080afc8e2aed4c19415ef11ab6d33af3dc9c1de4"

RPROVIDES:${PN} += "texlive-latex-bin-bin"

RDEPENDS:${PN} += "texlive-latex-bin"

inherit rpm
