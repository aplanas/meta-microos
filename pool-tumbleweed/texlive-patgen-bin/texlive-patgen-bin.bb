SUMMARY = "Binary files of patgen"
DESCRIPTION = "Binary files of patgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-patgen-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "c2612e86a6ea46b5ddaa8db48b93ed852f5dce4b78947af374a6453bd5da41ce2686bdb22f9aed1b95c6889b3fbe345f8198d003677b115cec9ac2ae5c925c30"

RPROVIDES:${PN} += "texlive-patgen-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-patgen"

inherit rpm
