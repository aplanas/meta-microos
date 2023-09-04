SUMMARY = "Binary files of latex2man"
DESCRIPTION = "Binary files of latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-latex2man-bin-2023.20230311.svn13663-93.2.aarch64.rpm"
RPM_HASH = "067295453e871682bdcb99d3aa97f80a82304ae7e6630755a4a20a08f8f918f3e990f929d2369f7fc4a096c57eda9d38ca250f8488f7c52c232868bf21981547"

RPROVIDES:${PN} += "texlive-latex2man-bin"

RDEPENDS:${PN} += "texlive-latex2man"

inherit rpm
