SUMMARY = "Binary files of pmx"
DESCRIPTION = "Binary files of pmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-pmx-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "94b1f3031a968f1d9ad88ffdf35d2d0a09dca1e6b6d51b8f71ea770e6e3c67967b1cb0017eeb4869f09c15f88c0bbd10d388937e6e436d4c4ff40f82d2247021"

RPROVIDES:${PN} += "texlive-pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
texlive-pmx"

inherit rpm
