SUMMARY = "Binary files of exceltex"
DESCRIPTION = "Binary files of exceltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25860"

RPM_NAME = "texlive-exceltex-bin-2023.20230311.svn25860-92.1.aarch64.rpm"
RPM_HASH = "184fee3b8da5f5d2c418f9582a5671bcd1eb85255fc283fadd2080f41d386f2e5891ac57129e3e0c442e95ac13966427f9ef9ea74225d924c2d6288a229f53fe"

RPROVIDES:${PN} += "texlive-exceltex-bin"

RDEPENDS:${PN} += "texlive-exceltex"

inherit rpm
