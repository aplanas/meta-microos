SUMMARY = "Binary files of mfware"
DESCRIPTION = "Binary files of mfware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mfware-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "1ee90071205d72a55cbda5b73b24004652c0ab30f296e68caa8216eaa624f0931eab55b8837eb0adf9125f2f3333ca0a15121f22ad3bbeb97643b80e854ea99d"

RPROVIDES:${PN} += "texlive-mfware-bin \
texlive-mfware-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libkpathsea.so.6()(64bit) \
texlive-mfware"

inherit rpm
