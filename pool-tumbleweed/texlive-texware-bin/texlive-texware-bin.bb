SUMMARY = "Binary files of texware"
DESCRIPTION = "Binary files of texware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-texware-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "97e819324beb80568e4d826309ea4962715ad16fabfc119e8279694f3f23fbd469df6365e0dc4aeca58519ab6c32d61e4f4f62f38c938d90d7feffa49a1ff1ce"

RPROVIDES:${PN} += "texlive-texware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-texware"

inherit rpm
