SUMMARY = "Binary files of texdef"
DESCRIPTION = "Binary files of texdef"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn45011"

RPM_NAME = "texlive-texdef-bin-2023.20230311.svn45011-91.1.aarch64.rpm"
RPM_HASH = "99c383ceb8bcaafaafa965fc07767fe6279dad2961f49d97212055f3a328347dc8e21ccc5d8ff5533a32308a2841ac4de4847bc6190d17447c552aa4b5992a2a"

RPROVIDES:${PN} += "texlive-texdef-bin \
texlive-texdef-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdef"

inherit rpm
