SUMMARY = "Binary files of pdfcrop"
DESCRIPTION = "Binary files of pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14387"

RPM_NAME = "texlive-pdfcrop-bin-2023.20230311.svn14387-92.1.aarch64.rpm"
RPM_HASH = "a663091de6d782cffccf0d4a7fde247f261e6ef2bdacb831d217dda8a965c9c32ba5d60646ebad7af444849db795c25b15cb2cf463f2780a6123c8e42c27fe8b"

RPROVIDES:${PN} += "texlive-pdfcrop-bin"

RDEPENDS:${PN} += "texlive-pdfcrop"

inherit rpm
