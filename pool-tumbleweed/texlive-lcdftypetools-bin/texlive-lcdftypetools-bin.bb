SUMMARY = "Binary files of lcdftypetools"
DESCRIPTION = "Binary files of lcdftypetools"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-lcdftypetools-bin-2023.20230311.svn62210-92.1.aarch64.rpm"
RPM_HASH = "15d30ac13b01529c3ff731f0082e5b50f8d37d628826ffe7bf53fd26e28e23286f15d8ca748fd2bdb8192345060fd9a54885e85316320323a83ff5848756448a"

RPROVIDES:${PN} += "texlive-lcdftypetools-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libstdc++.so.6 \
texlive-lcdftypetools"

inherit rpm
