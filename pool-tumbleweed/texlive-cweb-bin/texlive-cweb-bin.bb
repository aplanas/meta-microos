SUMMARY = "Binary files of cweb"
DESCRIPTION = "Binary files of cweb"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-cweb-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "eae68adda3ffcac03f23ed083bf55584ad7c5c0be2be656aee7b25b31b35b201b724b27b34a83cd277bb95d2cfb6f82c60e215adc56267b280a31cb061dce986"

RPROVIDES:${PN} += "texlive-cweb-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-cweb"

inherit rpm
