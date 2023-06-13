SUMMARY = "Binary files of xdvi"
DESCRIPTION = "Binary files of xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-xdvi-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "0ccccd7fb2213ed47fee7a51cf752edb5f81f7f80b5f5a85cbbef0ea84d4a5dde8ccb463063ead6b6c2c6822bccdc83b5f95942214413a739220fa8811446d4f"

RPROVIDES:${PN} += "texlive-xdvi-bin \
texlive-xdvi-bin(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXi.so.6()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
texlive-xdvi"

inherit rpm
