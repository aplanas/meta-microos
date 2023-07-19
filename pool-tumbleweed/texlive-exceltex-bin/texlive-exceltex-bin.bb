SUMMARY = "Binary files of exceltex"
DESCRIPTION = "Binary files of exceltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25860"

RPM_NAME = "texlive-exceltex-bin-2023.20230311.svn25860-93.1.aarch64.rpm"
RPM_HASH = "953939db130db41ace88c716a6723d5dc643ff63e8727b0e574ede582f4b1dac5b719d333be6cdf0764c97ef66601f25488ba52b6dd323b2bf3dbd636cdc916c"

RPROVIDES:${PN} += "texlive-exceltex-bin"

RDEPENDS:${PN} += "texlive-exceltex"

inherit rpm
