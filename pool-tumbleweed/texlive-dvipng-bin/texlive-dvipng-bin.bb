SUMMARY = "Binary files of dvipng"
DESCRIPTION = "Binary files of dvipng"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipng-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "6550abf06c20d19360f4e4c014d034cf08b01a377ba74504a4f71feeefae2b45a6096d030bede48bbcc1e8cc2796d129633e9f382ba0f431b68f64a108724cb6"

RPROVIDES:${PN} += "texlive-dvipng-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgd.so.3 \
libkpathsea.so.6 \
libm.so.6 \
texlive-dvipng"

inherit rpm
