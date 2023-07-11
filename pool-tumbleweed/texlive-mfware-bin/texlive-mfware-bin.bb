SUMMARY = "Binary files of mfware"
DESCRIPTION = "Binary files of mfware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mfware-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "2fa44c130792922f0037b0cfc31abd54dd12e4533fa9978ac1d6593f52af32dde4afa9aa44976eb073d48b7ca99f219333d4addb0ce00556338b08e9eec35e34"

RPROVIDES:${PN} += "texlive-mfware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-mfware"

inherit rpm
