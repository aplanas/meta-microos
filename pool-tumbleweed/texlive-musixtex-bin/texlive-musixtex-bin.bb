SUMMARY = "Binary files of musixtex"
DESCRIPTION = "Binary files of musixtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37026"

RPM_NAME = "texlive-musixtex-bin-2023.20230311.svn37026-92.1.aarch64.rpm"
RPM_HASH = "60f8cfb9f05e9f8477d2b5f21b3901fcc31d7538076ffa2039fd1483449e9ac60ad273e9a8eec28eaaef4b9f8d2d9cea2dc310a17b6e98a88c81853f91b14b41"

RPROVIDES:${PN} += "texlive-musixtex-bin"

RDEPENDS:${PN} += "texlive-m-tx-bin \
texlive-musixtex \
texlive-pmx-bin"

inherit rpm
