SUMMARY = "Binary files of makedtx"
DESCRIPTION = "Binary files of makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38769"

RPM_NAME = "texlive-makedtx-bin-2023.20230311.svn38769-93.2.aarch64.rpm"
RPM_HASH = "466c44b92cc8d7dac8b5c340a711db1c941e1eaca38d30a028f23d34ed66f414476696db25b2bbe043c9bd44b118c15b16ef899ad8fbfb1c207ca7cbdec30cf2"

RPROVIDES:${PN} += "texlive-makedtx-bin"

RDEPENDS:${PN} += "texlive-makedtx"

inherit rpm
