SUMMARY = "Binary files of latex2man"
DESCRIPTION = "Binary files of latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-latex2man-bin-2023.20230311.svn13663-92.1.aarch64.rpm"
RPM_HASH = "1110482d74e3dcb778362ba4f3f8e20c9c88e33d3c3d5f369708882fd910633b390f5984d9ddae3f2ae0c2783631553e094bf92ab3c2db35c28ffa22245b741e"

RPROVIDES:${PN} += "texlive-latex2man-bin"

RDEPENDS:${PN} += "texlive-latex2man"

inherit rpm
