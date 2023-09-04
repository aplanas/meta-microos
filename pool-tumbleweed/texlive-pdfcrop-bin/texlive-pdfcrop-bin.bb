SUMMARY = "Binary files of pdfcrop"
DESCRIPTION = "Binary files of pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14387"

RPM_NAME = "texlive-pdfcrop-bin-2023.20230311.svn14387-93.2.aarch64.rpm"
RPM_HASH = "9fd78014c5f7042ae1621ffd4fc1485b883596f861efd36ff22571672344a36bcb50a5567a00ad272918dfc94ca0636abd92d29e75bdadce5e926838ab670fc2"

RPROVIDES:${PN} += "texlive-pdfcrop-bin"

RDEPENDS:${PN} += "texlive-pdfcrop"

inherit rpm
