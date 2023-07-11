SUMMARY = "Binary files of cachepic"
DESCRIPTION = "Binary files of cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15543"

RPM_NAME = "texlive-cachepic-bin-2023.20230311.svn15543-92.1.aarch64.rpm"
RPM_HASH = "065738e16facb0b949edd05795e59ba4328ad6107871435e77d95cc4d3cb1de5125f07e366901210fbaa117091e84ccd12e1d3717a72e9145b937332cbc99701"

RPROVIDES:${PN} += "texlive-cachepic-bin"

RDEPENDS:${PN} += "texlive-cachepic"

inherit rpm
