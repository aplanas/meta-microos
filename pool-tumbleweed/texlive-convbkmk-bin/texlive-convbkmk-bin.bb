SUMMARY = "Binary files of convbkmk"
DESCRIPTION = "Binary files of convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30408"

RPM_NAME = "texlive-convbkmk-bin-2023.20230311.svn30408-91.1.aarch64.rpm"
RPM_HASH = "c9f6ec0972a417aeda8072c98296bc53e9c2b89a240aad69c6338243a07ceb606418e052d1c6b9e1064e73f696697d19a2a3d3684b3a4463826d54395bcd2ad8"

RPROVIDES:${PN} += "texlive-convbkmk-bin \
texlive-convbkmk-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-convbkmk"

inherit rpm
