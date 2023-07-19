SUMMARY = "Binary files of fontware"
DESCRIPTION = "Binary files of fontware"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-fontware-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "f22a9dd6a860a4dca29991746372133018407f5212abd61915e8b7cd4faeb9b9c68fc0e0ec4b2aa7ff9ba576edbb2dd3fed0b9ec7973d7be484a0fde4770bff3"

RPROVIDES:${PN} += "texlive-fontware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-fontware"

inherit rpm
