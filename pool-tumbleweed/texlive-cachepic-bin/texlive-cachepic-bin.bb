SUMMARY = "Binary files of cachepic"
DESCRIPTION = "Binary files of cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15543"

RPM_NAME = "texlive-cachepic-bin-2023.20230311.svn15543-93.1.aarch64.rpm"
RPM_HASH = "837c151e7660978d7919b57a51316d29eabf813a810cc2169fd2aa15fa3cba5528eeebca49c1b7e52720c60485150c015e161117854ea1ebe622edf436c05d41"

RPROVIDES:${PN} += "texlive-cachepic-bin"

RDEPENDS:${PN} += "texlive-cachepic"

inherit rpm
