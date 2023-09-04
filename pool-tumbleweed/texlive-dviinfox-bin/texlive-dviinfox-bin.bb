SUMMARY = "Binary files of dviinfox"
DESCRIPTION = "Binary files of dviinfox"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44515"

RPM_NAME = "texlive-dviinfox-bin-2023.20230311.svn44515-93.2.aarch64.rpm"
RPM_HASH = "8697e45be02d3365ae0560dddd2a1e681c2beff6aa491f9494687f7377c224cd959295e214def465abd037d05e8bd1e4d79cc25bbec4fd72b1f2cf451d4d5f2f"

RPROVIDES:${PN} += "texlive-dviinfox-bin"

RDEPENDS:${PN} += "texlive-dviinfox"

inherit rpm
