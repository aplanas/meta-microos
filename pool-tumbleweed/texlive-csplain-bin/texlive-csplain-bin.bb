SUMMARY = "Binary files of csplain"
DESCRIPTION = "Binary files of csplain"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn50528"

RPM_NAME = "texlive-csplain-bin-2023.20230311.svn50528-92.1.aarch64.rpm"
RPM_HASH = "bc870fc7dd8f629b01052b23f081b2bd840c2e3b887c2c96fd87ac1530879f108b70b4f3ba00ba7ab3c79e8023ef46dd7e1caccf65199452a18048bde93a1948"

RPROVIDES:${PN} += "texlive-csplain-bin"

RDEPENDS:${PN} += "texlive-csplain"

inherit rpm
