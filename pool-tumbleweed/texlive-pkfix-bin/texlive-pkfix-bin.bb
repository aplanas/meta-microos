SUMMARY = "Binary files of pkfix"
DESCRIPTION = "Binary files of pkfix"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13364"

RPM_NAME = "texlive-pkfix-bin-2023.20230311.svn13364-92.1.aarch64.rpm"
RPM_HASH = "869031865618e4d7ef31a5e5194f3ffb02635974c7ff7a6aabfa11a028e72d691cdb60249c7c6b7852d3d86f7684b2968b63da81a52cea43b83be62daed6513c"

RPROVIDES:${PN} += "texlive-pkfix-bin"

RDEPENDS:${PN} += "texlive-pkfix"

inherit rpm
