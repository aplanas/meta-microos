SUMMARY = "Binary files of pdfcrop"
DESCRIPTION = "Binary files of pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14387"

RPM_NAME = "texlive-pdfcrop-bin-2023.20230311.svn14387-93.1.aarch64.rpm"
RPM_HASH = "4afb482b61ce3eb6712abf9aee4cf24da2957a82ff7c59156a575f61031ddae332e0c28ed528bb76d3dbb9097f052c49ad3d45bf19b4668ae4af7f82e62d7737"

RPROVIDES:${PN} += "texlive-pdfcrop-bin"

RDEPENDS:${PN} += "texlive-pdfcrop"

inherit rpm
