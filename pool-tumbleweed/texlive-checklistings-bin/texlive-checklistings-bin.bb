SUMMARY = "Binary files of checklistings"
DESCRIPTION = "Binary files of checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38300"

RPM_NAME = "texlive-checklistings-bin-2023.20230311.svn38300-93.2.aarch64.rpm"
RPM_HASH = "55eb35a5b11b588907e6662142eae6e0b9221d1230bebfffa97ce725f6bb80633c8652c552207ac944a446231950990243fcc9a0024a918e67b5e2674962360d"

RPROVIDES:${PN} += "texlive-checklistings-bin"

RDEPENDS:${PN} += "texlive-checklistings"

inherit rpm
