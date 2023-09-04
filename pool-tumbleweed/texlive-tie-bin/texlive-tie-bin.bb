SUMMARY = "Binary files of tie"
DESCRIPTION = "Binary files of tie"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-tie-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "c50db87b92415740ecf3ed0f69271c0b994b4de81a7ff34240d67bb1861e1c950e176f211edff87054f916cc94f7b3051718b4d4fbc2baf043a9bad7403ca155"

RPROVIDES:${PN} += "texlive-tie-bin"

RDEPENDS:${PN} += "libc.so.6 \
libkpathsea.so.6 \
texlive-tie"

inherit rpm
