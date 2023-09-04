SUMMARY = "Binary files of texware"
DESCRIPTION = "Binary files of texware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-texware-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "6e58de884783f774f5347ec5ae8b65e06f4767b7b0b38001f22f8b6df0b8861a03b9726b41b547603c596987fc34cbe153cd51e04eaa9b36bac4ce7963449057"

RPROVIDES:${PN} += "texlive-texware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-texware"

inherit rpm
