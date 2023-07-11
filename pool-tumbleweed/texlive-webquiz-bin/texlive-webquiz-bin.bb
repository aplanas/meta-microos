SUMMARY = "Binary files of webquiz"
DESCRIPTION = "Binary files of webquiz"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50419"

RPM_NAME = "texlive-webquiz-bin-2023.20230311.svn50419-92.1.aarch64.rpm"
RPM_HASH = "571253048b3724cca31405e95d426aeafb063767f2310cee99f55e70de3e8623d6fa38ec5bdcc78e12a7c05fb1bfc30cbdc283edfa8b86a111efa674e27b4776"

RPROVIDES:${PN} += "texlive-webquiz-bin"

RDEPENDS:${PN} += "texlive-webquiz"

inherit rpm
