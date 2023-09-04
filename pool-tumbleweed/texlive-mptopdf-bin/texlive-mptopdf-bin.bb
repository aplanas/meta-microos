SUMMARY = "Binary files of mptopdf"
DESCRIPTION = "Binary files of mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18674"

RPM_NAME = "texlive-mptopdf-bin-2023.20230311.svn18674-93.2.aarch64.rpm"
RPM_HASH = "67369e708558a4f5d9550bc7590891316996d3611c57b613eb305446a32b29e76942914f613fb0e9862efe71a3562a272519989ca459f5a83019d1d81ffec66c"

RPROVIDES:${PN} += "texlive-mptopdf-bin"

RDEPENDS:${PN} += "texlive-mptopdf"

inherit rpm
