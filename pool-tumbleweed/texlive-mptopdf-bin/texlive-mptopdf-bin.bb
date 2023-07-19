SUMMARY = "Binary files of mptopdf"
DESCRIPTION = "Binary files of mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18674"

RPM_NAME = "texlive-mptopdf-bin-2023.20230311.svn18674-93.1.aarch64.rpm"
RPM_HASH = "c4367111a2fa36b6d80ce830cefe3e165d482c4c996c8c06880a6015351fc69de40b68ffcca5188e3a773e2bc08453e38f2f94905003aa94d534c8bcd2012292"

RPROVIDES:${PN} += "texlive-mptopdf-bin"

RDEPENDS:${PN} += "texlive-mptopdf"

inherit rpm
