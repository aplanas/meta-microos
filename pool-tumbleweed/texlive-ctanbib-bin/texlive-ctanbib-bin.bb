SUMMARY = "Binary files of ctanbib"
DESCRIPTION = "Binary files of ctanbib"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48478"

RPM_NAME = "texlive-ctanbib-bin-2023.20230311.svn48478-91.1.aarch64.rpm"
RPM_HASH = "bca0408d1776b6f33809b1df0774ac11e178ead87f30767680e4ab8e4a6aaf6175e33ccb9bde48af2bdf786b96d4dd6929123812bf26c3d2ac7cb7ca08499227"

RPROVIDES:${PN} += "texlive-ctanbib-bin \
texlive-ctanbib-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-ctanbib"

inherit rpm
