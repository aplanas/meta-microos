SUMMARY = "Binary files of velthuis"
DESCRIPTION = "Binary files of velthuis"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-velthuis-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "302e38cbaff573fd23dc1477027cb0b73e08796534116a5eeca209b15fb5d36f76eac3959f6ffd8bc9ce5af85d02038c0bd3c31bdab2127770dc22ce77f0e463"

RPROVIDES:${PN} += "texlive-velthuis-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-velthuis"

inherit rpm
