SUMMARY = "Binary files of pythontex"
DESCRIPTION = "Binary files of pythontex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn31638"

RPM_NAME = "texlive-pythontex-bin-2023.20230311.svn31638-93.1.aarch64.rpm"
RPM_HASH = "47d43933e32532e1df3c69851a38581943fbea9324d00ed72c017783cedab14d94d016166845c09d4196113cc7ee499d222007d25e15c05e701e0358902826a6"

RPROVIDES:${PN} += "texlive-pythontex-bin"

RDEPENDS:${PN} += "texlive-pythontex"

inherit rpm
